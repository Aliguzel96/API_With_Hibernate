package com.save_Product.demo.Service;

import com.save_Product.demo.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public void save(String productNumber) {
        repository.saveProduct(productNumber);
    }
}
