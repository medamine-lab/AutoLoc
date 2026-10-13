package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {

    Client creer(Client client);

    Client obtenirParId(Long id);

    List<Client> listerTous();

    Client mettreAJour(Client client);

    void supprimer(Long id);
}
