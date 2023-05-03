package com.example.mapstruct.springbootmapstructexample.dto;

import com.example.mapstruct.springbootmapstructexample.model.Item;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDto {


    private int id;
    private String name;
   // private String description;
    private int quantity;
    private long price;
    private String itemId;

}
