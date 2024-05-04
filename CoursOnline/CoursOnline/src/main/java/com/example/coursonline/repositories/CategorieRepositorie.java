package com.example.coursonline.repositories;

import com.example.coursonline.entites.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepositorie extends JpaRepository<Categorie,Long> {
}
