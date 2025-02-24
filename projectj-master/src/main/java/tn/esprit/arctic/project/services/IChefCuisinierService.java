package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.ChefCuisinier;

import java.util.List;

public interface IChefCuisinierService {
    ChefCuisinier saveChefCuisinier(ChefCuisinier chefCuisinier);

    ChefCuisinier getChefCuisinierById(Long id);

    List<ChefCuisinier> getAllChefCuisiniers();

    ChefCuisinier updateChefCuisinier(Long id, ChefCuisinier chefCuisinier);

    void deleteChefCuisinier(Long id);

    List<ChefCuisinier> addChefCuisiniers(List<ChefCuisinier> chefCuisiniers);
}
