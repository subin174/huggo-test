package com.shophuggo.huggo.api.reponses;

import com.shophuggo.huggo.entities.enums.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ProductReponse {
    private Long id;

    private int quantity;
    private List<String> images;
    private BigDecimal price;
    private String name;
    private LocalDateTime createdAt;
    private String description;
    private BigDecimal discount;
    private ProductStatus status;

}
