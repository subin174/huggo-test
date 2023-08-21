package com.shophuggo.huggo.repositories;

import com.shophuggo.huggo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long > {
}
