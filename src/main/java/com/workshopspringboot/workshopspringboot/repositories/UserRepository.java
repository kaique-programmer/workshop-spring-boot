package com.workshopspringboot.workshopspringboot.repositories;

import com.workshopspringboot.workshopspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
