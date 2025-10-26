package com.example.mobileapi.repository;

import com.example.mobileapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Mewarisi JpaRepository memberikanmu fungsi: findAll(), save(), findById(), dll.
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
    // cek apakah email sudah terdaftar
    boolean existsByEmail(String email);
}