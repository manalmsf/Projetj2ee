package com.example.coursonline.repositories;

import com.example.coursonline.entites.Professeur;
import com.example.coursonline.entites.SuivreCours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepositorie extends JpaRepository<Professeur,Long> {

}
