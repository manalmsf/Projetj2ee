package com.example.coursonline.controllers;
import com.example.coursonline.entites.SuivreCours;
import com.example.coursonline.services.SuivreCoursService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class SuivreCoursController {
    private SuivreCoursService suivreCoursService;
    @RequestMapping("/createSuivreCours")
    public String createSuivreCours(){
        return"CreateSuivreCours";
    }
    @RequestMapping("saveSuivreCours")
    public String saveSuivreCours(@ModelAttribute("SuivreCoursVue") SuivreCours suivreCoursController){
        SuivreCours saveSuivreCours = suivreCoursService.saveSeance(suivreCoursController);
        return "CreateSuivreCours";
    }

    @RequestMapping("/saveSuivreCoursList")
    public String SuivreCoursList(ModelMap modelMap){
        List<SuivreCours> suivreCoursController =suivreCoursService.getAllSuivreCours();
        modelMap.addAttribute("SuivreCoursVue",suivreCoursController);
        return "SuivreCoursList";
    }


    @RequestMapping("/deleteSuivreCours")
    public String deleteSuivreCours(@RequestParam("id") Long id, ModelMap modelMap) {
        suivreCoursService.deleteSuivreCoursById(id);
        return "SuivreCoursList(modelMap)";

    }
    @RequestMapping("/editSuivreCours")
    public String editSuivreCours(@RequestParam("id") Long id ,  ModelMap modelMap){
        SuivreCours suivreCoursController = suivreCoursService.getSuivreCoursById(id);
        modelMap.addAttribute("SuivreCoursView",suivreCoursController);
        return "EditSuivreCours";

    }

}
