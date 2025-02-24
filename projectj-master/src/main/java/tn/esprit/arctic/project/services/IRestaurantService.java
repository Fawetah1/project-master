package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.Restaurant;

import java.util.List;

public interface IRestaurantService {

    Restaurant saveRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(Long id);

    List<Restaurant> getAllRestaurants();

    Restaurant updateRestaurant(Long id, Restaurant restaurant);

    void deleteRestaurant(Long id);

    List<Restaurant> addRestaurants(List<Restaurant> restaurants);
}