package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.DetailComposant;
@Repository
public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long> {
}
