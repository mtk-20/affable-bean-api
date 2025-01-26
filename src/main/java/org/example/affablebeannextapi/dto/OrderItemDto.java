package org.example.affablebeannextapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class OrderItemDto {
    private int id;
    private String description;
    private LocalDateTime lastUpdate;
    private int quantity;
    private String name;
    private double price;
}
