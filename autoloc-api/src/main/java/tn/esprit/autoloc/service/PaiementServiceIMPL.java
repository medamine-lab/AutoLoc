package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaimentRepository;

import java.util.List;

public class PaiementServiceIMPL implements IPaiementService {

    PaimentRepository paimentRepository;

    @Override
    public Paiement creer(Paiement paiement) { return paimentRepository.save(paiement); }

    @Override
    public Paiement obtenirParId(Long id) { return paimentRepository.findById(id).orElse(null); }

    @Override
    public List<Paiement> listerTous() { return (List<Paiement>) paimentRepository.findAll(); }

    @Override
    public Paiement mettreAJour(Paiement paiement) { return paimentRepository.save(paiement); }

    @Override
    public void supprimer(Long id) { paimentRepository.deleteById(id); }
}
