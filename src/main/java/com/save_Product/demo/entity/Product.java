package com.save_Product.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String productNumber;
    private String name;
    private String category;
    private String photoUrl;
    private String description;
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    private Date pdateDate;
    private double price;

}
