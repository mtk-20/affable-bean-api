package org.example.affablebeannextapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class RequestInfo {
    private CustomerInfo customer;
    private List<OrderItemDto> purchaseItems= new ArrayList<OrderItemDto>();
}
