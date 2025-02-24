package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.IChefCuisinierService;

@Controller
@AllArgsConstructor
public class ChefCuisinierController {
    private IChefCuisinierService chefCuisinierService;
}
