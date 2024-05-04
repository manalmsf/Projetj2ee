package com.example.coursonline.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Planification {
    @Id
    private Long  id;

    private Date datePlanification;
    /*relation


    private Professeur professeur;
     */
@OneToMany(mappedBy = "planification",fetch = FetchType.LAZY)
    private List<Professeur> professeurs = new ArrayList<>();
}
