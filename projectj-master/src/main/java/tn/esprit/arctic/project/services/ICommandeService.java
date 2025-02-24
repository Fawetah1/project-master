package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.Commande;

import java.util.List;

public interface ICommandeService {

    Commande saveCommande(Commande commande);

    Commande getCommandeById(Long id);

    List<Commande> getAllCommandes();

    Commande updateCommande(Long id, Commande commande);

    void deleteCommande(Long id);

    List<Commande> addCommandes(List<Commande> commandes);
}
