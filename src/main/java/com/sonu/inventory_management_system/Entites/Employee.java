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
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String empName;
    private String position;
    private String email;
    private String role;
    private String password;

    @OneToMany(mappedBy = "issueTo")
    private List<Stock> stocks;


}
