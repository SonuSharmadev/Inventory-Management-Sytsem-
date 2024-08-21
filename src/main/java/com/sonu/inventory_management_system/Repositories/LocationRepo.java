package com.sonu.inventory_management_system.Repositories;

import com.sonu.inventory_management_system.Entites.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {

    @Query("select l.name from Location l where l.locationId = :locationId")
    String findNameByLocationId(Long locationId);
}
