package com.sonu.inventory_management_system.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    private String name;

//    @OneToMany(mappedBy = "location")
//    private List<Item> items;

//    @OneToMany(mappedBy = "location")
//    private List<Stock> stocks;

}
