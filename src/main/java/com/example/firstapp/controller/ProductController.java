package com.example.firstapp.controller;
import com.example.firstapp.modal.Product;
import com.example.firstapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    // GET
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    // GET
    @RequestMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    // POST
    @PostMapping("/products")
    public void setProducts(@RequestBody Product prod){
        service.setProducts(prod);
    }

    // PUT
    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod){
        service.updateProducts(prod);
    }

    // DELETE
    @DeleteMapping("/products/{prodId}")
    public void deleleProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
