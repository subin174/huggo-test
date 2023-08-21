package com.shophuggo.huggo.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.shophuggo.huggo.entities.enums.CategoryStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    private String image;
    @Enumerated(EnumType.STRING)
    private CategoryStatus status = CategoryStatus.ACTIVE;

}
