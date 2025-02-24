package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.ChaineRestauration;
import tn.esprit.arctic.project.entity.ChefCuisinier;
@Repository
public interface ChefCuisinierRepository extends CrudRepository<ChefCuisinier,Long> {
}
