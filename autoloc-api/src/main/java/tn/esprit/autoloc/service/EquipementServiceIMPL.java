package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

public class EquipementServiceIMPL implements IEquipementService {

    EquipementRepository equipementRepository;

    @Override
    public Equipement creer(Equipement equipement) { return equipementRepository.save(equipement); }

    @Override
    public Equipement obtenirParId(Long id) { return equipementRepository.findById(id).orElse(null); }

    @Override
    public List<Equipement> listerTous() { return (List<Equipement>) equipementRepository.findAll(); }

    @Override
    public Equipement mettreAJour(Equipement equipement) { return equipementRepository.save(equipement); }

    @Override
    public void supprimer(Long id) { equipementRepository.deleteById(id); }
}
