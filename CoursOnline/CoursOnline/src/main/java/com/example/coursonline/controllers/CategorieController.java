package com.example.coursonline.controllers;

import com.example.coursonline.entites.Categorie;
import com.example.coursonline.services.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;

    @RequestMapping("/createCategorie")
    public String createCategorie() {
        return "CreateCategorie";
    }

    @RequestMapping("/saveCategorie")
    public String saveCategorie(@ModelAttribute("categorie") Categorie categorie) {
        categorieService.saveCategorie(categorie);
        return "CreateCategorie";
    }

    @RequestMapping("/categorieList")
    public String categorieList(ModelMap model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "CategorieList";
    }

    @RequestMapping("/deleteCategorie")
    public String deleteCategorie(@RequestParam("id") long id, ModelMap model) {
        categorieService.deleteCategorie(id);
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "CategorieList";
    }

    @RequestMapping("/editCategorie")
    public String editCategorie(@RequestParam("id") long id, ModelMap model) {
        Categorie categorie = categorieService.getCategorieById(id);
        model.addAttribute("categorie", categorie);
        return "EditCategorie";
    }

    @RequestMapping("/updateCategorie")
    public String updateCategorie(@ModelAttribute("categorie") Categorie categorie) {
        categorieService.updateCategorie(categorie);
        return "CreateCategorie";
    }
}
