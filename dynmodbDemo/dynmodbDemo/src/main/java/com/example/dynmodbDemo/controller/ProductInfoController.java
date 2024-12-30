package com.example.dynmodbDemo.controller;

import com.example.dynmodbDemo.entity.Product;
import com.example.dynmodbDemo.repository.ProductInfoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductInfoController {

    private ProductInfoRepository productInfoRepository;
    public ProductInfoController(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }
    @GetMapping
    public List<Product> getAllProducts() {
        Iterable<Product> all = productInfoRepository.findAll();
        return (List<Product>) all;
    }
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productInfoRepository.save(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {

        productInfoRepository.delete(productInfoRepository.findById(id).get());
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        product.setId(id);
        return productInfoRepository.save(product);
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productInfoRepository.findById(id).get();
    }
}
