package com.groupeisi.companySpringBoot.mapper;

import com.groupeisi.companySpringBoot.Entity.PurchaseEntity;
import com.groupeisi.companySpringBoot.dto.PurchaseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {
    PurchaseEntity toPurchasesEntity(PurchaseDto purchasesDto);

    PurchaseDto toPurchasesDto(PurchaseEntity purchasesEntity);

    List<PurchaseDto> toListPurchasesDto(List<PurchaseEntity> purchasesEntities) ;
}
