package com.workshopspringboot.workshopspringboot.config;

import com.workshopspringboot.workshopspringboot.entities.Order;
import com.workshopspringboot.workshopspringboot.entities.User;
import com.workshopspringboot.workshopspringboot.repositories.OrderRepository;
import com.workshopspringboot.workshopspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "123456", "988888888");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "123456", "977777777");

        Order o1 = new Order(null, Instant.parse("2020-05-18T19:55:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2020-05-20T19:53:10Z"), u2);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2));
    }
}
