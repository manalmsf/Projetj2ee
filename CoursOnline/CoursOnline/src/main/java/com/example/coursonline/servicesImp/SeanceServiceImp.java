package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.Seance;
import com.example.coursonline.repositories.SeanceRepositorie;
import com.example.coursonline.services.SeanceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceServiceImp implements SeanceService {

    private SeanceRepositorie seanceRepositorie;


    @Override
    public Seance saveSeance(Seance seance) {
        return seanceRepositorie.save(seance);
    }

    @Override
    public Seance updateSeance(Seance seance) {
        return seanceRepositorie.save(seance);
    }

    @Override
    public void deleteSeanceById(Long id) {
        seanceRepositorie.deleteById(id);

    }

    @Override
    public void deleteAllSeance() {

    }

    @Override
    public Seance getSeanceById(Long id) {
        return seanceRepositorie.findById(id).get();
    }

    @Override
    public List<Seance>getAllSeance() {
        return seanceRepositorie.findAll();
    }
}
