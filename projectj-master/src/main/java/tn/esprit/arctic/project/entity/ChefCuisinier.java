package tn.esprit.arctic.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;
    @ManyToMany(mappedBy="chefCuisiniers",cascade = CascadeType.ALL)
    private List<Menu> menus;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
}