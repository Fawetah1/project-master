package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.Client;

import java.util.List;

public interface IClientService {

    Client saveClient(Client client);
    Client getClientById(Long id);
    List<Client> getAllClients();
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);

    List<Client>  addClients (List<Client> clients);
}