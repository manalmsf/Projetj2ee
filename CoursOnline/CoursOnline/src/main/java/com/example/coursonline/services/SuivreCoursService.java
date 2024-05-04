package com.example.coursonline.services;
import com.example.coursonline.entites.SuivreCours;
import java.util.List;

public interface SuivreCoursService {
    SuivreCours saveSeance( SuivreCours suivrecours);
    SuivreCours updateSeance(SuivreCours suivrecours);
    void deleteSuivreCoursById(Long id);
    SuivreCours  getSuivreCoursById(Long id);
    List< SuivreCours>getAllSuivreCours();

}
