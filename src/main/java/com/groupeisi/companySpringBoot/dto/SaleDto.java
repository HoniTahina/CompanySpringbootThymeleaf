package com.groupeisi.companySpringBoot.dto;

import com.groupeisi.companySpringBoot.Entity.ProductEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SaleDto {
    private Long id;

    private Date dateP;

    private double quantity;

    private ProductEntity product;
}
