package tn.esprit.arctic.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;
    private Float prixTotal;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private List<Composant> composants;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private List<Commande> commandes;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<ChefCuisinier> chefCuisiniers;
}
