package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.Commande;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
