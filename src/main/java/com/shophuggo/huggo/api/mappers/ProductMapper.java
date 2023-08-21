package com.shophuggo.huggo.api.mappers;

import com.shophuggo.huggo.api.reponses.ProductListReponse;
import com.shophuggo.huggo.api.reponses.ProductReponse;
import com.shophuggo.huggo.api.requests.ProductRequest;
import com.shophuggo.huggo.entities.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper extends ResourceMapper<Product, ProductRequest, ProductReponse>{
    ProductListReponse responseToListResponse(ProductReponse entity);
}
