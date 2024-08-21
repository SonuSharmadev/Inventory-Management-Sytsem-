package com.sonu.inventory_management_system.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String type;
    private String name;
    private String brandName;
    private int newQuantity;
    private int oldQuantity;
    private int totalQuantity;
    private int size;  // New field


    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    // Method to calculate totalQuantity
    @PrePersist
    @PreUpdate
    public void calculateTotalQuantity() {
        this.totalQuantity = this.newQuantity + this.oldQuantity;
    }


}
