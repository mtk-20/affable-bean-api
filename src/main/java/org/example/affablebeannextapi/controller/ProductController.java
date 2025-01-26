package org.example.affablebeannextapi.controller;

import lombok.RequiredArgsConstructor;
import org.example.affablebeannextapi.dto.CategoryDto;
import org.example.affablebeannextapi.dto.ProductDto;
import org.example.affablebeannextapi.dto.RequestInfo;
import org.example.affablebeannextapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/affable-bean")
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all")
    public List<ProductDto> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{categoryId}")
    public List<ProductDto> getProductsByCategory(@PathVariable int categoryId) {
        return productService.findProductsByCategoryId(categoryId);
    }

    @GetMapping("/categories")
    public List<CategoryDto> getAllCategories() {
        return productService.findAllCategories();
    }

    @PostMapping("/checkout")
    public ResponseEntity<String> getCheckOutOrder(@RequestBody RequestInfo requestInfo) {
        String responsString = productService.saveCheckOutItems(requestInfo);
        return new ResponseEntity<>(responsString, HttpStatus.OK);
    }
}
