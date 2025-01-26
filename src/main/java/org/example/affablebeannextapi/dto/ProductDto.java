package org.example.affablebeannextapi.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {
    private int id;
    private String description;
    private LocalDateTime lastUpdate;
    private String name;
    private double price;
}
