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
public class Seance {
    @Id
    private Long  id;
    private Date date;
    /* relation suivreCours */
 @ManyToOne
    private SuivreCours suivreCoursS;
}
