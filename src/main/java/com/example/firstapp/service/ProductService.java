package com.example.firstapp.service;

import com.example.firstapp.modal.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.firstapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "Iphone", 20000),
//            new Product(2, "POCO", 10000),
//            new Product(3, "Realme", 15000)
//    ));

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }

    public void setProducts(Product prod){
        repo.save(prod);
    }

    public void updateProducts(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }

}
