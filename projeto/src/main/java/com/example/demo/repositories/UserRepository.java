package com.example.demo.repositories;

import org.springframework.data.jpa.repository.*;

import com.example.demo.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    // Se precisar de métodos específicos para a manipulação de usuários, você pode adicioná-los aqui
}
