package com.example.coursonline.repositories;
import com.example.coursonline.entites.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepositorie extends JpaRepository<Commentaire,Long> {
}
