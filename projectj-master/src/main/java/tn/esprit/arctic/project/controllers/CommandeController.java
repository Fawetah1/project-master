package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.CommandeService;

@AllArgsConstructor
@Controller
public class CommandeController {
    private CommandeService commandeService;
}
