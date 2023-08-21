package com.shophuggo.huggo.api.services;

import com.shophuggo.huggo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductServiceimpl extends JpaRepository<Product, Long>{

}

