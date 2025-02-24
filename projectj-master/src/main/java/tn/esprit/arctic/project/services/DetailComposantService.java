package tn.esprit.arctic.project.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.project.entity.DetailComposant;
import tn.esprit.arctic.project.repositories.DetailComposantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService {

    private final DetailComposantRepository detailComposantRepository;



    @Override
    public DetailComposant saveDetailComposant(DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public DetailComposant getDetailComposantById(Long id) {
        return detailComposantRepository.findById(id).orElse(null);
    }

    @Override
    public List<DetailComposant> getAllDetailComposants() {
        return detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant updateDetailComposant(Long id, DetailComposant detailComposant) {
        return detailComposantRepository.save(detailComposant);
    }

    @Override
    public void deleteDetailComposant(Long id) {
        detailComposantRepository.deleteById(id);
    }

    @Override
    public List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants) {
        return detailComposantRepository.saveAll(detailComposants);
    }
}