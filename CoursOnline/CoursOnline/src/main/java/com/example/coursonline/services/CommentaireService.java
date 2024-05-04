package com.example.coursonline.services;

import com.example.coursonline.entites.Commentaire;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface CommentaireService {
    Commentaire getCommentaire(long id);
    List<Commentaire> getAllCommentaire();
    void deleteCommentaire(long id);
    void saveCommentaire(Commentaire commentaire);
    void updateCommentaire(Commentaire commentaire);
    void addCommentaire(Commentaire commentaire);


}
