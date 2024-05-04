package com.example.coursonline.repositories;

import com.example.coursonline.entites.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepositorie extends JpaRepository<Cours,Long> {
}
