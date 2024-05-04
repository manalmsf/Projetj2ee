package com.example.coursonline.servicesImp;

import com.example.coursonline.entites.SuivreCours;
import com.example.coursonline.repositories.SuivreCoursRepositorie;
import com.example.coursonline.services.SuivreCoursService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SuivreCoursServiceImp implements SuivreCoursService {
    private SuivreCoursRepositorie suivreCoursRepositorie;
    @Override
    public SuivreCours saveSeance(SuivreCours suivrecours) {
        return suivreCoursRepositorie.save(suivrecours);

    }

    @Override
    public SuivreCours updateSeance(SuivreCours suivrecours) {
        return  suivreCoursRepositorie.save(suivrecours);
    }

    @Override
    public void deleteSuivreCoursById(Long id) {
        suivreCoursRepositorie.deleteById(id);

    }


    @Override
    public SuivreCours getSuivreCoursById(Long id) {
        return suivreCoursRepositorie.findById(id).get();
    }

    @Override
    public List<SuivreCours> getAllSuivreCours() {
        return suivreCoursRepositorie.findAll();
    }

}
