package com.example.coursonline.services;

import com.example.coursonline.entites.Professeur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfesseurService {
    Professeur saveProfesseur(Professeur professeur);
    Professeur updateProfesseur(Professeur professeur);
    void deleteProfesseurById(Long id);
    void deleteAllProfesseur();
    Professeur getProfesseurById(Long id);
    List<Professeur> getAllProfesseur();


}
