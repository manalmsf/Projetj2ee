package com.example.coursonline.repositories;

import com.example.coursonline.entites.Seance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepositorie extends JpaRepository<Seance,Long> {
}
