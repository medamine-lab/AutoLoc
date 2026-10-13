package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

public class ContratServiceIMPL implements IContratService {

    ContratRepository contratRepository;

    @Override
    public Contrat creer(Contrat contrat) { return contratRepository.save(contrat); }

    @Override
    public Contrat obtenirParId(Long id) { return contratRepository.findById(id).orElse(null); }

    @Override
    public List<Contrat> listerTous() { return (List<Contrat>) contratRepository.findAll(); }

    @Override
    public Contrat mettreAJour(Contrat contrat) { return contratRepository.save(contrat); }

    @Override
    public void supprimer(Long id) { contratRepository.deleteById(id); }
}
