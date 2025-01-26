package org.example.affablebeannextapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CustomerInfo {
    private String name;
    private String email;
    private String phone;
    private String address;
}
