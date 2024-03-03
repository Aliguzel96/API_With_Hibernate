package com.save_Product.demo.Controller;

import com.save_Product.demo.Service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {

    private final ProductService service;

    public Controller(ProductService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void saveProduct(@RequestParam String productNumber) {
        service.save(productNumber);
    }
}
