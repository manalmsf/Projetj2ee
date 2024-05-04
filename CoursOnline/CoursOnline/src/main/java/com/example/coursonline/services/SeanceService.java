package com.example.coursonline.services;

import com.example.coursonline.entites.Seance;

import java.util.List;

public interface SeanceService {
    Seance saveSeance( Seance seance);
    Seance updateSeance( Seance seance);
    void deleteSeanceById(Long id);
    void deleteAllSeance();
    Seance  getSeanceById(Long id);

    List<Seance>getAllSeance();
}
