package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.ComposantService;

@Controller
@AllArgsConstructor
public class ComposantController {
    private ComposantService composantService;
}
