package com.example.coursonline.services;

import com.example.coursonline.entites.Cours;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface CoursService{
    Cours createCours(Cours cours);
    Cours updateCours(Cours cours);
    List<Cours> getAllCours();
    Cours getCours(long id);
    List<Cours> getCoursById(long id);
    void addCours(Cours cours);
    void deleteCours(long id);
    void saveCours(Cours cours);


}