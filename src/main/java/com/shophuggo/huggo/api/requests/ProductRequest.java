package com.shophuggo.huggo.api.requests;

import com.shophuggo.huggo.entities.enums.ProductStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.List;

public class ProductRequest {
    private int quantity;
    private List<String> images;
    private BigDecimal price;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductStatus status = ProductStatus.ACTIVE;

}
