package tn.esprit.arctic.project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.project.services.IRestaurantService;

@Controller
@AllArgsConstructor
public class RestaurantController {
    private IRestaurantService restaurantService;
}
