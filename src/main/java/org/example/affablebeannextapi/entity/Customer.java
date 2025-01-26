package org.example.affablebeannextapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String phone;

    private String address;

    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> customerOrders= new ArrayList<CustomerOrder>();

//    public void addCustomerOrder(CustomerOrder customerOrder) {
//        customerOrder.setCustomer(this);
//        customerOrders.add(customerOrder);
//    }
//
//    public Customer(String name, String email, String phone, String address) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//    }
}
