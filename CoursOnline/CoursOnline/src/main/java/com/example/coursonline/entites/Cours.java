package com.example.coursonline.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cours {
    @Id
    private Long  id;
    private String titre;
    private String description;
    /*relation
    private Professeur professeur;
    private Categorie categorie;
    cours*/
    @ManyToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "coursP", fetch = FetchType.LAZY)
    private List<Professeur> professeur = new ArrayList<>();
    @OneToMany(mappedBy = "coursS" , fetch = FetchType.LAZY)
    private List<SuivreCours>suivreCours=new ArrayList<>();
    @OneToMany(mappedBy = "coursC",fetch = FetchType.LAZY)
    private List<Commentaire> commentaire =new ArrayList<>();
}
