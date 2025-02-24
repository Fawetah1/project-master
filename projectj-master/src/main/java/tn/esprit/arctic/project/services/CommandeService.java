package tn.esprit.arctic.project.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.project.entity.Commande;
import tn.esprit.arctic.project.repositories.CommandeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {

    private final CommandeRepository commandeRepository;


    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande getCommandeById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande updateCommande(Long id, Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }
}
