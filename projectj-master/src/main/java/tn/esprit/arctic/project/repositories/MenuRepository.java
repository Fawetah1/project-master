package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.Menu;

import java.util.List;
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Object> findAllById(Long idMenu);
}
