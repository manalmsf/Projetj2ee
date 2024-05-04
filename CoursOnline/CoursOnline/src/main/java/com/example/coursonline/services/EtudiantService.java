package com.example.coursonline.services;

import com.example.coursonline.entites.Etudiant;

import java.util.List;

public interface EtudiantService  {
    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiantById(Long id);
    void deleteAllEtudiant();
    Etudiant  getEtudiantById(Long id);
    List<Etudiant> getAllEtudiant();


}
