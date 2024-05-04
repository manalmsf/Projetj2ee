package com.example.coursonline.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Professeur {
    @Id
    private Long id_Prof;
    private String nom;
    private String prenom;
    private Number Phone;
    private String specialite;
    /*
    relation :
    cours
    planing

     */
    @ManyToOne
    private Cours coursP;
    @ManyToOne
    private Planification planification;
}
