package com.shophuggo.huggo.api.requests;

import com.shophuggo.huggo.entities.enums.CategoryStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest {
    private long id;
    private String name;
    private String image;
    private CategoryStatus status;
}
