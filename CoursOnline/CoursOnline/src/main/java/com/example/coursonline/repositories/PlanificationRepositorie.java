package com.example.coursonline.repositories;

import com.example.coursonline.entites.Planification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanificationRepositorie extends JpaRepository<Planification,Long> {
}
