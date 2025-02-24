package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.IMenuService;

@Controller
@AllArgsConstructor
public class MenuController {
    private IMenuService menuService;
}
