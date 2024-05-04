package com.example.coursonline.controllers;
import com.example.coursonline.entites.Seance;
import com.example.coursonline.services.SeanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class SeanceController {
    private SeanceService seanceService;
        @RequestMapping("createSeance")
        public String createSeance(){
            return"CreateSeance";
        }
        @RequestMapping("saveSeance")
        public String saveSeance(@ModelAttribute("SeanceVue") Seance seanceController){
            Seance saveSeance = seanceService.saveSeance(seanceController);
            return "CreateSeance";
        }

       @RequestMapping("/ saveSeanceList")
        public String SeanceList(ModelMap modelMap){
            List<Seance> seanceController =seanceService.getAllSeance();
            modelMap.addAttribute("SeanceVue",seanceController);
            return "SeanceList";
        }



        @RequestMapping("/deleteSeance")
        public String deleteSeance(@RequestParam("id") Long id, ModelMap modelMap) {
            seanceService.deleteSeanceById(id);
            return "SeanceList(modelMap)";

        }
        @RequestMapping("/editSeance")
        public String editSeance(@RequestParam("id") Long id ,  ModelMap modelMap){
            Seance seanceController = seanceService.getSeanceById(id);
            modelMap.addAttribute("seanceView",seanceController);
            return "EditSeance";

        }

}

