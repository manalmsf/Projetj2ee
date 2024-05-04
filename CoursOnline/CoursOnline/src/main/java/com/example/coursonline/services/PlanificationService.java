package com.example.coursonline.services;

import com.example.coursonline.entites.Planification;

import java.util.List;

public interface PlanificationService {
   Planification savePlanification(Planification planification);
    Planification updatePlanification(Planification planification);
    void deletePlanificationById(Long id);
    void deleteAllPlanification();
    Planification  getPlanificationById(Long id);
    List<Planification> getAllPlanification();
}
