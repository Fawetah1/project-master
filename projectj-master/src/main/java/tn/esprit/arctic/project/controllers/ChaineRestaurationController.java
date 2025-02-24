package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.IChaineRestaurationService;

@AllArgsConstructor
@Controller
public class ChaineRestaurationController {
    private IChaineRestaurationService chaineRestaurationService;
}
