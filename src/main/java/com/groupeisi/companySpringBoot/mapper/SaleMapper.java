package com.groupeisi.companySpringBoot.mapper;

import com.groupeisi.companySpringBoot.Entity.PurchaseEntity;
import com.groupeisi.companySpringBoot.Entity.SaleEntity;
import com.groupeisi.companySpringBoot.dto.PurchaseDto;
import com.groupeisi.companySpringBoot.dto.SaleDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SaleMapper {
    SaleEntity toSaleEntity(SaleDto saleDto);

    SaleDto toSaleDto(SaleEntity saleEntity);

    List<SaleDto> toListSaleDto(List<SaleEntity> saleEntities) ;

}
