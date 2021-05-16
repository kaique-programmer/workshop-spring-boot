package com.workshopspringboot.workshopspringboot.repositories;

import com.workshopspringboot.workshopspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
