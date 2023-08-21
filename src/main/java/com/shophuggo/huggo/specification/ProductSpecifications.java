package com.shophuggo.huggo.specification;

import com.shophuggo.huggo.entities.Product;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class ProductSpecifications  {

        public static Specification<Product> bang(String name,Object value){
            return (root, query, criteriaBuilder)-> criteriaBuilder.equal(root.get(name), value);
        }

}




