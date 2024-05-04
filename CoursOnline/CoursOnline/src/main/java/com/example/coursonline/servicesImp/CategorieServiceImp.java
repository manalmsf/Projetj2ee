package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Categorie;
import com.example.coursonline.repositories.CategorieRepositorie;
import com.example.coursonline.repositories.CategorieRepositorie;
import com.example.coursonline.services.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class CategorieServiceImp implements CategorieService {
    private CategorieRepositorie categorieRepository;
    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);

    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }


}
