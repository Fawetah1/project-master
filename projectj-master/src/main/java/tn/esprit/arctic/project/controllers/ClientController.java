package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.IClientService;

@Controller
@AllArgsConstructor
public class ClientController {
    private IClientService clientService;
}
