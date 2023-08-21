package com.shophuggo.huggo.api.mappers;

import com.shophuggo.huggo.api.reponses.CategoryResponse;
import com.shophuggo.huggo.api.requests.CategoryRequest;
import com.shophuggo.huggo.entities.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper extends ResourceMapper<Category, CategoryRequest, CategoryResponse> {
}
