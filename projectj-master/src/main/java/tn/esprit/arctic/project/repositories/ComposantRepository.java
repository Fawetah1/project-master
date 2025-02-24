package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.Composant;
@Repository
public interface ComposantRepository extends JpaRepository<Composant, Long> {
}
