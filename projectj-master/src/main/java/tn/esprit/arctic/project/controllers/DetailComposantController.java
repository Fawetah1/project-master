package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.entity.DetailComposant;
import tn.esprit.arctic.project.services.IDetailComposantService;

@Controller
@AllArgsConstructor
public class DetailComposantController {
    private IDetailComposantService detailComposantService;
}
