package com.sonu.inventory_management_system.Repositories;

import com.sonu.inventory_management_system.Entites.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long> {


    @Query("select i.itemId from Item i")
    List<Long> findAllIds();
}
