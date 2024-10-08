package com.example.E_com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity( name = "product")
public class Product {
    @Id
    @Column( name = "property_id", length = 80, nullable = false )
    private String propertyId;

    @Column( name = "quantity" )
    private long qty;

    @Column( name = "unit_price" )
    private double unitPrice;

    @Column( name = "description", length = 255 )
    private String description;

    @Column( name = "is_available", columnDefinition = "TINYINT" )
    private boolean isAvailable;

//    relation
    @OneToMany( mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private Set<ProductImage> images = new HashSet<>();

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    private Set<CustomerOrderProduct> customerOrderProducts = new HashSet<>();
}
