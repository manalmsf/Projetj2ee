package com.example.coursonline.controllers;

import com.example.coursonline.entites.Commentaire;
import com.example.coursonline.services.CommentaireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class CommentaireController {

    private final CommentaireService commentaireService;

    @RequestMapping("/createCommentaire")
    public String createCommentaire() {
        return "CreateCommentaire";
    }

    @RequestMapping("/saveCommentaire")
    public String saveCommentaire(@ModelAttribute("commentaire") Commentaire commentaire) {
        commentaireService.saveCommentaire(commentaire);
        return "CreateCommentaire";
    }

    @RequestMapping("/commentaireList")
    public String commentaireList(ModelMap model) {
        List<Commentaire> commentaires = commentaireService.getAllCommentaire();
        model.addAttribute("commentaires", commentaires);
        return "CommentaireList";
    }

    @RequestMapping("/deleteCommentaire")
    public String deleteCommentaire(@RequestParam("id") long id, ModelMap model) {
        commentaireService.deleteCommentaire(id);
        List<Commentaire> commentaires = commentaireService.getAllCommentaire();
        model.addAttribute("commentaires", commentaires);
        return "CommentaireList";
    }

    @RequestMapping("/editCommentaire")
    public String editCommentaire(@RequestParam("id") long id, ModelMap model) {
        Commentaire commentaire = commentaireService.getCommentaire(id);
        model.addAttribute("commentaire", commentaire);
        return "EditCommentaire";
    }

    @RequestMapping("/updateCommentaire")
    public String updateCommentaire(@ModelAttribute("commentaire") Commentaire commentaire) {
        commentaireService.updateCommentaire(commentaire);
        return "CreateCommentaire";
    }
}
