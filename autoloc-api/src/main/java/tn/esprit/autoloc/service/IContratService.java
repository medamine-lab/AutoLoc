package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {

    Contrat creer(Contrat contrat);

    Contrat obtenirParId(Long id);

    List<Contrat> listerTous();

    Contrat mettreAJour(Contrat contrat);

    void supprimer(Long id);
}
