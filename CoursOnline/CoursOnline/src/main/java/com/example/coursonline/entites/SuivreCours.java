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
public class SuivreCours {
    @Id
    private Long id;

    private boolean continueCours;

    @ManyToOne
    private Cours coursS;
    @ManyToOne
    private Etudiant etudiantS;
    @OneToMany(mappedBy = "suivreCoursS",fetch = FetchType.LAZY)
    private List<Seance>seances=new ArrayList<>();

}
