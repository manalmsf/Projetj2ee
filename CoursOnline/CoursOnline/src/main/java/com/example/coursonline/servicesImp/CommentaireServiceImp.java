package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Commentaire;
import com.example.coursonline.repositories.CommentaireRepository;
import com.example.coursonline.services.CommentaireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class CommentaireServiceImp implements CommentaireService {
    private CommentaireRepository commentaireRepository;


    @Override
    public Commentaire getCommentaire(long id) {
        return commentaireRepository.findById(id).get();
    }

    @Override
    public List<Commentaire> getAllCommentaire() {
        return commentaireRepository.findAll();
    }

    @Override
    public void deleteCommentaire(long id) {
        commentaireRepository.deleteById(id);

    }

    @Override
    public void saveCommentaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);

    }

    @Override
    public void updateCommentaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);

    }

    @Override
    public void addCommentaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);

    }
}
