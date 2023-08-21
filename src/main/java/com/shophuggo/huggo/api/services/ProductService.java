package com.shophuggo.huggo.api.services;


import com.shophuggo.huggo.entities.Product;
import com.shophuggo.huggo.repositories.ProductRepository;
import com.shophuggo.huggo.specification.ProductSpecifications;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService{
    final ProductRepository repository;


    public List<Product> search(String field,Object value,String field2,Object value2) {

        Specification<Product> specification = Specification.where(ProductSpecifications.bang(field,value).or(ProductSpecifications.bang(field2,value2)));
        List<Product> products = repository.findAll(specification);
        return products;


    }
}
