package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

public class AgenceServiceIMPL implements IAgenceService {

    AgenceRepository agenceRepository;
    @Override
    public Agence creer(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence obtenirParId(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> listerTous() {
        return (List<Agence>) agenceRepository.findAll();
    }

    @Override
    public Agence mettreAJour(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimer(Long id) {
        agenceRepository.deleteById(id);
    }
}
