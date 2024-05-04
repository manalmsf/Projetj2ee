package com.example.coursonline.controllers;
import com.example.coursonline.entites.Planification;
import com.example.coursonline.services.PlanificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller

public class PlanificationController {
    private PlanificationService planificationService;
    @RequestMapping("createPlanification")
    public String createPlanification(){
        return"CreatePlanification";
    }
    @RequestMapping("savePlanification")
    public String savePlanification(@ModelAttribute("planificationVue") Planification planificationController){
        Planification savePlanifcation = planificationService.savePlanification(planificationController);
        return "CreatePlanification";
    }
    @RequestMapping("/planificationList")
    public String planificationList(ModelMap modelMap){
        List<Planification> planificationController =planificationService.getAllPlanification();
        modelMap.addAttribute("planificationVue", planificationController);
        return "PlanificationList";
    }
    @RequestMapping("/deletePlanification")
    public String deletePlanification(@RequestParam("id") Long id, ModelMap modelMap) {
        planificationService.deletePlanificationById(id);
        return planificationList(modelMap);

    }
    @RequestMapping("/editPlanification")
    public String editPlanification(@RequestParam("id") Long id ,  ModelMap modelMap){
        Planification planificationController = planificationService.getPlanificationById(id);
        modelMap.addAttribute("planifcationView",planificationController);
        return "EditPlanification";

    }

}
