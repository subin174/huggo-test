package com.shophuggo.huggo.api.reponses;

import com.shophuggo.huggo.entities.enums.ProductStatus;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductListReponse {
    private Long id;

    private String images;
    private BigDecimal price;
    private ProductStatus status;

    private String name;
}
