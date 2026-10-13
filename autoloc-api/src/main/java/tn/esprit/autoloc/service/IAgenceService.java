package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;

import java.util.List;

@Service
public interface IAgenceService {
    Agence creer(Agence agence);;
    Agence obtenirParId(Long id);
    List<Agence> listerTous();
    Agence mettreAJour(Agence agence);
    void supprimer(Long id);
}
