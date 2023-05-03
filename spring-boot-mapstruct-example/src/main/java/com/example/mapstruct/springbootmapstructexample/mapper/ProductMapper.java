package com.example.mapstruct.springbootmapstructexample.mapper;


import com.example.mapstruct.springbootmapstructexample.dto.ProductDto;
import com.example.mapstruct.springbootmapstructexample.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper(componentModel = "spring")//imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE= Mappers.getMapper(ProductMapper.class);
   // @Mapping(source = "product.desc",target="description")
    //@Mapping(target = "itemId",expression = "java(UUID.randomUUID().toString())")
    ProductDto modelToDto(Product product);
    //@Mapping(source = "productDto.description",target="desc")
    Product dtoToModel(ProductDto productDto);
}
