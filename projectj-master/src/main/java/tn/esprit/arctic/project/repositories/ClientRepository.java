package tn.esprit.arctic.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.project.entity.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {



}
