package com.workshopspringboot.workshopspringboot.services;

import com.workshopspringboot.workshopspringboot.entities.Order;
import com.workshopspringboot.workshopspringboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> OrderOptional = orderRepository.findById(id);
        return OrderOptional.get();
    }
}
