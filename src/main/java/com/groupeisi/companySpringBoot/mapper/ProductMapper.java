package com.groupeisi.companySpringBoot.mapper;

import com.groupeisi.companySpringBoot.Entity.ProductEntity;
import com.groupeisi.companySpringBoot.dto.ProductDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface ProductMapper {
    ProductEntity toProductEntity(ProductDto productDto);

    ProductDto toProductDto(ProductEntity productEntity);

    List<ProductDto> toProductDtoList(List<ProductEntity> productEntityList);
}
