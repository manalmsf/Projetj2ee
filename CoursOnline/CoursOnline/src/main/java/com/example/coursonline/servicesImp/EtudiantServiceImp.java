package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Etudiant;
import com.example.coursonline.repositories.EtudiantRepositorie;
import com.example.coursonline.services.EtudiantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImp implements EtudiantService {

    private EtudiantRepositorie etudiantRepositorie;
    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepositorie.save(etudiant);   }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepositorie.save(etudiant);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepositorie.deleteById(id);
    }

    @Override
    public void deleteAllEtudiant() {

    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepositorie.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepositorie.findAll();
    }
}
