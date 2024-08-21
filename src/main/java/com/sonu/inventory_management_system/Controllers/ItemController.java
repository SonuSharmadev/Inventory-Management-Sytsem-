package com.sonu.inventory_management_system.Controllers;

import com.sonu.inventory_management_system.Entites.Item;
import com.sonu.inventory_management_system.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<>(itemService.getAllItems(),HttpStatus.OK);
    }

    @PostMapping("/add")
    public Item createItem(@RequestBody Item item) {
        return itemService.creatItem(item);
    }

    @GetMapping("/ids")
    public ResponseEntity<List<Long>> getAllIds() {
        List<Long> ids = itemService.getAllIds();
        return new ResponseEntity<>(ids, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long itemId) {
        Item item = itemService.getItemById(itemId);
        if (item != null) {
            return new ResponseEntity<>(item, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
