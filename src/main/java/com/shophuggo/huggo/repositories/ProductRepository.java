package com.shophuggo.huggo.repositories;

import com.shophuggo.huggo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product>{


}
