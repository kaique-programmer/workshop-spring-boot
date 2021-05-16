package com.workshopspringboot.workshopspringboot.repositories;

import com.workshopspringboot.workshopspringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
