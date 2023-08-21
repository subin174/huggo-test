package com.shophuggo.huggo.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shophuggo.huggo.entities.enums.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
    @Table(name = "products")
public class Product extends BaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @ElementCollection
    private List<String>  images;
    private String name;
    @Column(precision = 19)
    @ColumnDefault("'0'")
    private BigDecimal price;
    @Column(precision = 19)
    @ColumnDefault("'0'")
    private BigDecimal discount;
    private Integer quantity;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Transient
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String categoryName;
    @Enumerated(EnumType.STRING)
    private ProductStatus status = ProductStatus.ACTIVE;
}
