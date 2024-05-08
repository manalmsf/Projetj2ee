package com.example.coursonline.controllers;

import com.example.coursonline.entites.Professeur;
import com.example.coursonline.services.ProfesseurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor

public class ProfesseurController {

    private ProfesseurService professeurService;
    @RequestMapping("/createProfesseur")
    public String createProfesseur() {
        return "CreateProfesseur";
    }
    @RequestMapping("/saveProfesseur")
    public String saveProfesseur(@ModelAttribute ("Profview") Professeur ProfController ) {
        Professeur saveProfesseur = professeurService.saveProfesseur(ProfController);
        return "CreateProfesseur";

    }
    @RequestMapping("/professeurList")
    public String ProfesseurList(ModelMap model) {
        List<Professeur>professeurs=professeurService.getAllProfesseur();
        model.addAttribute("Profview", professeurs);
        return "ProfesseurList";


    }
    @RequestMapping("/deleteProfesseur")
    public String deleteProfesseur(@RequestParam ("id") long id, ModelMap model) {
        professeurService.deleteProfesseurById(id);
        List<Professeur>professeurs=professeurService.getAllProfesseur();
        model.addAttribute("Profview", professeurs);
        return "ProfesseurList";
    }
    @RequestMapping("/EditProfesseur")
    public String EditProfesseur(@RequestParam ("id") long id, ModelMap model) {
        Professeur professeur= professeurService.getProfesseurById(id);
        model.addAttribute("Profview",professeur);
        return "EditProfesseur";


    }

    @RequestMapping("/updateProfesseur")
    public String updateProfesseur(@ModelAttribute("Profview") Professeur ProfController){
        professeurService.updateProfesseur(ProfController);
        return "CreateProfesseur";

    }

}
