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
public class Etudiant {
    @Id
    private Long  id;
    private String nom;
    private String prenom;
    private String email;
    private Number phone;
    /*  suivre
     commentaire */
    @OneToMany (mappedBy = "etudiantC" , fetch = FetchType.LAZY)
    private List<Commentaire>commentaires = new ArrayList<>();
    @OneToMany(mappedBy = "etudiantS",fetch = FetchType.LAZY)
    private  List<SuivreCours>suivreCours = new ArrayList<>();

}
