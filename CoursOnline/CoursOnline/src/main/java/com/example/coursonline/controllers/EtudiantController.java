package com.example.coursonline.controllers;
import com.example.coursonline.entites.Etudiant;
import com.example.coursonline.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)

@Controller
@AllArgsConstructor
public class EtudiantController {
    private EtudiantService etudiantService;
    @RequestMapping("/createEtudiant")
    public String createEtudiant(){
        return"CreateEtudiant";
    }
    @RequestMapping("saveEtudiant")
    public String saveEtudiant(@ModelAttribute("etudiantVue") Etudiant etudiantController){
        /*SuivreCoursController.setsuivreCours(suivreCours.Active);*/
        Etudiant saveEtudiant = etudiantService.saveEtudiant(etudiantController);
        return "CreateEtudiant";
    }
    @RequestMapping("/etudiantList")
    public String etudiantList(ModelMap modelMap){
        List<Etudiant> etudiantsController =etudiantService.getAllEtudiant();
        modelMap.addAttribute("etudiantVue", etudiantsController);
        return "EtudiantList";
    }
    @RequestMapping("/deleteEtudiant")
    public String deleteEtudiant(@RequestParam("id") Long id, ModelMap modelMap) {
        etudiantService.deleteEtudiantById(id);
        return etudiantList(modelMap);
        /*List<Etudiant> etudiantsController = etudiantService.getAllEtudiant();
        modelMap.addAttribute("etudiantVue", etudiantsController);
        return "EtudiantList";*/
    }
    @RequestMapping("/editEtudiant")
    public String editEtudiant(@RequestParam("id") Long id ,  ModelMap modelMap){
        Etudiant etudiantController = etudiantService.getEtudiantById(id);
        modelMap.addAttribute("etudiantView",etudiantController);
        return "EtudiantList";

    }








}
