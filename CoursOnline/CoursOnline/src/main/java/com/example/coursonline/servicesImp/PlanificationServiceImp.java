package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Planification;
import com.example.coursonline.repositories.PlanificationRepositorie;
import com.example.coursonline.services.PlanificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlanificationServiceImp implements PlanificationService {
    private PlanificationRepositorie planificationRepositorie ;


    @Override
    public Planification savePlanification(Planification planification) {
        return planificationRepositorie.save(planification);
    }

    @Override
    public Planification updatePlanification(Planification planification) {
        return planificationRepositorie.save(planification);
    }

    @Override
    public void deletePlanificationById(Long id) {
        planificationRepositorie.deleteById(id);


    }

    @Override
    public void deleteAllPlanification() {

    }

    @Override
    public Planification getPlanificationById(Long id) {
        return planificationRepositorie.findById(id).get();
    }

    @Override
    public List<Planification> getAllPlanification() {
        return planificationRepositorie.findAll();
    }
}
