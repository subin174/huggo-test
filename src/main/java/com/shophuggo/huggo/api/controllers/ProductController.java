package com.shophuggo.huggo.api.controllers;

import com.shophuggo.huggo.api.services.ProductService;
import com.shophuggo.huggo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("get-name-phone")
    public List<Product> getByNameAndPhone(@RequestParam("name") String name,@RequestParam("description") String description)
    {
        return productService.search("name", name,"description",description);
    }
}
