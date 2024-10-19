package com.groupeisi.companySpringBoot.dto;

import com.groupeisi.companySpringBoot.Entity.ProductEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PurchaseDto implements Serializable {
    private Long id;

    private Date dateP;

    private double quantity;

    private ProductEntity product;
}
