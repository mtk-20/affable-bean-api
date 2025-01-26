package org.example.affablebeannextapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private int id;

    private String description;

    private LocalDateTime lastUpdate;

    private int quantity;

    private String name;

    private double price;

    @OneToMany(mappedBy = "orderItem")
    private List<CustomerOrder> customerOrders= new ArrayList<CustomerOrder>();

//    public OrderItem(int id, String description, LocalDateTime lastUpdate, int quantity, String name, double price) {
//        this.id = id;
//        this.description = description;
//        this.lastUpdate = lastUpdate;
//        this.quantity = quantity;
//        this.name = name;
//        this.price = price;
//    }
//
//    public void addCustomerOrder(CustomerOrder customerOrder) {
//        customerOrder.setOrderItem(this);
//        customerOrders.add(customerOrder);
//    }
}
