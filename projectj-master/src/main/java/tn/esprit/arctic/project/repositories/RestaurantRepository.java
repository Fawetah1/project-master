package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
