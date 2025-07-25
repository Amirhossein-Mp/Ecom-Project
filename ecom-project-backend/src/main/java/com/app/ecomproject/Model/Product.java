package com.app.ecomproject.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed from int to Long for better compatibility

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;


    private Date releaseDate;

    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;
}