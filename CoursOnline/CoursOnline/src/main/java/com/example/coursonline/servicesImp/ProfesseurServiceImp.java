package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Professeur;
import com.example.coursonline.repositories.ProfesseurRepositorie;
import com.example.coursonline.repositories.ProfesseurRepositorie;
import com.example.coursonline.services.ProfesseurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesseurServiceImp implements ProfesseurService {
    private ProfesseurRepositorie professeurRepository;

    @Override

    public Professeur saveProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    @Override
    public Professeur updateProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    @Override
    public void deleteProfesseurById(Long id) {
        professeurRepository.deleteById(id);

    }

    @Override
    public void deleteAllProfesseur() {
        professeurRepository.deleteAll();

    }

    @Override
    public Professeur getProfesseurById(Long id) {
        return professeurRepository.findById(id).get();
    }

    @Override
    public List<Professeur> getAllProfesseur() {
        return professeurRepository.findAll();
    }
}
