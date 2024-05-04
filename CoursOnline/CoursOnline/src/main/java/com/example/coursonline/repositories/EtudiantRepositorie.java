package com.example.coursonline.repositories;

import com.example.coursonline.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EtudiantRepositorie extends JpaRepository<Etudiant,Long> {
}
