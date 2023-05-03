package com.example.mapstruct.springbootmapstructexample.controller;

import com.example.mapstruct.springbootmapstructexample.dto.ProductDto;
import com.example.mapstruct.springbootmapstructexample.mapper.ProductMapper;
import com.example.mapstruct.springbootmapstructexample.model.Product;
import com.example.mapstruct.springbootmapstructexample.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/productSave")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto) {
        return new ResponseEntity<>
                (productRepo.save(productMapper.dtoToModel(productDto)), HttpStatus.CREATED);
    }
}
