package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.ChaineRestauration;
@Repository
public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
}
