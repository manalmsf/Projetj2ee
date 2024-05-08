package com.example.coursonline.services;

import com.example.coursonline.entites.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieService {
    Categorie getCategorieById(Long id);
    List<Categorie> getAllCategories();
    Categorie addCategorie(Categorie categorie);
    Categorie updateCategorie(Categorie categorie);
    void deleteCategorie(Long id);
    Categorie saveCategorie(Categorie categorie);


}
