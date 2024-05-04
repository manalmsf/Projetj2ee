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
public class Categorie {
    @Id
    private Long id;
    private String nom;
    private String description;
    /*
    relation :cours*/

    @OneToMany(mappedBy = "categorie",fetch = FetchType.LAZY)
    private List<Cours> coursC = new ArrayList<>();
}
