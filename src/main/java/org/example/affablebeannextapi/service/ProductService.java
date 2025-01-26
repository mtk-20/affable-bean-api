package org.example.affablebeannextapi.service;

import lombok.RequiredArgsConstructor;
import org.example.affablebeannextapi.dao.*;
import org.example.affablebeannextapi.dto.CategoryDto;
import org.example.affablebeannextapi.dto.OrderItemDto;
import org.example.affablebeannextapi.dto.ProductDto;
import org.example.affablebeannextapi.dto.RequestInfo;
import org.example.affablebeannextapi.entity.Customer;
import org.example.affablebeannextapi.entity.CustomerOrder;
import org.example.affablebeannextapi.entity.OrderItem;
import org.example.affablebeannextapi.util.EntityUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final CategoryDao categoryDao;
    private final ProductDao productDao;
    private final CustomerDao customerDao;
    private final OrderItemDao orderItemDao;
    private final CustomerOrderDao customerOrderDao;

    public List<CategoryDto> findAllCategories() {
        return categoryDao.findAll()
                .stream()
                .map(EntityUtil::toCateDto)
                .collect(Collectors.toList());
    }

    public List<ProductDto> findAllProducts() {
        return productDao.findAll()
                .stream()
                .map(EntityUtil::toProdDto)
                .collect(Collectors.toList());
    }

    public List<ProductDto> findProductsByCategoryId(int categoryId) {
        return productDao.findProdByCateId(categoryId)
                .stream()
                .map(EntityUtil::toProdDto)
                .collect(Collectors.toList());
    }

    private String randomOrderId() {
        SecureRandom random = new SecureRandom();
        int rum = random.nextInt(1, 100000) + 100000;
        return String.valueOf(rum);
    }

    @Transactional
    public String saveCheckOutItems(RequestInfo requestInfo) {
        Customer customer = EntityUtil.toCustomer(requestInfo.getCustomer());
        String randomOrderId = randomOrderId();
        LocalDate currentDate = LocalDate.now();
        for (OrderItemDto item : requestInfo.getPurchaseItems()) {
            CustomerOrder customerOrder = new CustomerOrder();
            customerOrder.setOrderCode(randomOrderId);
            customerOrder.setOrderDate(currentDate);
            OrderItem orderItem = EntityUtil.toOrderItem(item);
            customerOrder.setOrderItem(orderItem);
            customerOrder.setCustomer(customer);
            customerDao.save(customer);
            orderItemDao.save(orderItem);
            customerOrderDao.save(customerOrder);
        }
        return randomOrderId;
    }
}
