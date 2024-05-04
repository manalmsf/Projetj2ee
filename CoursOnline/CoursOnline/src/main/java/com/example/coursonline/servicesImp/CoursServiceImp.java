package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Cours;
import com.example.coursonline.repositories.CoursRepository;
import com.example.coursonline.services.CoursService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class CoursServiceImp implements CoursService {
    private CoursRepository coursRepository;
    @Override
    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getCours(long id) {

        return coursRepository.findById(id).get();
    }

    @Override
    public List<Cours> getCoursById(long id) {
        return coursRepository.findAll();
    }

    @Override
    public void addCours(Cours cours) {
        coursRepository.save(cours);

    }

    @Override
    public void deleteCours(long id) {
        coursRepository.deleteById(id);

    }

    @Override
    public void saveCours(Cours cours) {
       coursRepository.save(cours);
    }
}
