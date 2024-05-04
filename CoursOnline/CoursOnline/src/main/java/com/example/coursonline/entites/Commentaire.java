package com.example.coursonline.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commentaire {
    @Id
    private Long id;
    private String contenu;
    private Date date;
    /*relation
    private Etudiant auteur_Etud;
    cours

     */
@ManyToOne
    private Cours coursC;
@ManyToOne
    private Etudiant etudiantC;
}
