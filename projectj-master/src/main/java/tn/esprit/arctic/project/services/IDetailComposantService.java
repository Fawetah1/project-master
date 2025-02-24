package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    DetailComposant saveDetailComposant(DetailComposant detailComposant);
    DetailComposant getDetailComposantById(Long id);
    List<DetailComposant> getAllDetailComposants();
    DetailComposant updateDetailComposant(Long id, DetailComposant detailComposant);
    void deleteDetailComposant(Long id);
    List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants);
}