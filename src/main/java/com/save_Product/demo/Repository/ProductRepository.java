package com.save_Product.demo.Repository;

import com.save_Product.demo.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveProduct(String productNumber) {

        Product product = new Product();
        product.setProductNumber(productNumber);

        entityManager.merge(product);
        System.out.println("İşleminiz gerçekleştirilmiştir!");

    }


}
