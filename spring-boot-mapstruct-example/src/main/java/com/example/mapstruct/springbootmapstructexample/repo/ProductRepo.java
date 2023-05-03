package com.example.mapstruct.springbootmapstructexample.repo;

import com.example.mapstruct.springbootmapstructexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
