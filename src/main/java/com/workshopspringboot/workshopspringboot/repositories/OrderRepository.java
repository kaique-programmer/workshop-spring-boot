package com.workshopspringboot.workshopspringboot.repositories;

import com.workshopspringboot.workshopspringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
