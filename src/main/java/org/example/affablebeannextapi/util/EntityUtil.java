package org.example.affablebeannextapi.util;

import org.example.affablebeannextapi.dto.CategoryDto;
import org.example.affablebeannextapi.dto.CustomerInfo;
import org.example.affablebeannextapi.dto.OrderItemDto;
import org.example.affablebeannextapi.dto.ProductDto;
import org.example.affablebeannextapi.entity.Category;
import org.example.affablebeannextapi.entity.Customer;
import org.example.affablebeannextapi.entity.OrderItem;
import org.example.affablebeannextapi.entity.Product;
import org.springframework.beans.BeanUtils;

public class EntityUtil {
    public static CategoryDto toCateDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        BeanUtils.copyProperties(category, categoryDto);
        return categoryDto;
    }

    public static ProductDto toProdDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Customer toCustomer(CustomerInfo customerInfo) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerInfo, customer);
        return customer;
    }

    public static OrderItem toOrderItem(OrderItemDto orderItemDto) {
        OrderItem orderItem1 = new OrderItem();
        BeanUtils.copyProperties(orderItemDto, orderItem1);
        return orderItem1;
    }
}
