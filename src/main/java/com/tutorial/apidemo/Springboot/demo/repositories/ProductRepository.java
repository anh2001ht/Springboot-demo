package com.tutorial.apidemo.Springboot.demo.repositories;

import com.tutorial.apidemo.Springboot.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
