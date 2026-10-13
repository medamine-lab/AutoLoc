package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

public class ClientServiceIMPL implements IClientService {

    ClientRepository clientRepository;

    @Override
    public Client creer(Client client) { return clientRepository.save(client); }

    @Override
    public Client obtenirParId(Long id) { return clientRepository.findById(id).orElse(null); }

    @Override
    public List<Client> listerTous() { return (List<Client>) clientRepository.findAll(); }

    @Override
    public Client mettreAJour(Client client) { return clientRepository.save(client); }

    @Override
    public void supprimer(Long id) { clientRepository.deleteById(id); }
}
