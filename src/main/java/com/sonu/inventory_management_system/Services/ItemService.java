package com.sonu.inventory_management_system.Services;

import com.sonu.inventory_management_system.Entites.Item;
import com.sonu.inventory_management_system.Repositories.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;


    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    public Item creatItem(Item item) {
        return itemRepo.save(item);
    }

    public List<Long> getAllIds() {
       return itemRepo.findAllIds();

    }

    public Item getItemById(Long itemId) {
        Optional<Item> itemOptional = itemRepo.findById(itemId);
        return itemOptional.get();
    }
}
