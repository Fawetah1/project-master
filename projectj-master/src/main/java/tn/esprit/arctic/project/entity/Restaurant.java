package tn.esprit.arctic.project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idRestaurant; // Clé primaire
    private String nom;
    private Long nbPlacesMax;
    @ManyToOne
    private ChaineRestauration chaineRestauration;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Menu> menu;


}
