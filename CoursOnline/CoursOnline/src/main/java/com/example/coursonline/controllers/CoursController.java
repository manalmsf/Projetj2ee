package com.example.coursonline.controllers;

import com.example.coursonline.entites.Cours;
import com.example.coursonline.services.CoursService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class CoursController {

    private final CoursService coursService;

    @RequestMapping("/createCours")
    public String createCours() {
        return "CreateCours";
    }

    @RequestMapping(value = "/saveCours", method = RequestMethod.POST)
    public String saveCours(@ModelAttribute("cours") Cours cours, ModelMap model) {
        coursService.saveCours(cours);
        return coursList(model);
    }

    @RequestMapping("/coursList")
    public String coursList(ModelMap model) {
        List<Cours> coursList = coursService.getAllCours();
        model.addAttribute("coursList", coursList);
        return "CoursList";
    }

    @RequestMapping("/deleteCours")
    public String deleteCours(@RequestParam("id") long id, ModelMap model) {
        coursService.deleteCours(id);
        return coursList(model);
    }

    @RequestMapping("/editCours")
    public String editCours(@RequestParam("id") long id, ModelMap model) {
        Cours cours = coursService.getCours(id);
        model.addAttribute("cours", cours);
        return "EditCours";
    }

    @RequestMapping(value = "/updateCours", method = RequestMethod.POST)
    public String updateCours(@ModelAttribute("cours") Cours cours, ModelMap model) {
        coursService.updateCours(cours);
        return coursList(model);
    }
}
