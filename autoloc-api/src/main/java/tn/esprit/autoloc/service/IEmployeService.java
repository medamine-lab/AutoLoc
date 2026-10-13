package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    Employe creer(Employe employe);

    Employe obtenirParId(Long id);

    List<Employe> listerTous();

    Employe mettreAJour(Employe employe);

    void supprimer(Long id);
}
