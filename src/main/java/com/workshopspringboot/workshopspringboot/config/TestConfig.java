package com.workshopspringboot.workshopspringboot.config;

import com.workshopspringboot.workshopspringboot.entities.Order;
import com.workshopspringboot.workshopspringboot.entities.Product;
import com.workshopspringboot.workshopspringboot.entities.User;
import com.workshopspringboot.workshopspringboot.entities.Category;
import com.workshopspringboot.workshopspringboot.entities.enums.OrderStatus;
import com.workshopspringboot.workshopspringboot.repositories.CategoryRepository;
import com.workshopspringboot.workshopspringboot.repositories.OrderRepository;
import com.workshopspringboot.workshopspringboot.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Computers");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Construction");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", "",90.5);
        Product p2 = new Product(null, "Hammer", "Nulla eu imperdiet purus. Maecenas ante.", "", 2190.0);
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.","", 1250.0);
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", "", 1200.0);
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", "", 100.99);

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "123456", "988888888");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "123456", "977777777");
        User u3 = new User(null, "Kaique Oliveira", "kaique@gmail.com", "123456", "955555555");

        Order o1 = new Order(null, Instant.parse("2020-05-18T19:55:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2020-05-20T19:53:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2020-05-21T21:44:10Z"), OrderStatus.CANCELED, u3);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
