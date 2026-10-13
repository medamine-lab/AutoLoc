package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

public class VehiculeServiceIMPL implements IVehiculeService {

    VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule creer(Vehicule vehicule) { return vehiculeRepository.save(vehicule); }

    @Override
    public Vehicule obtenirParId(Long id) { return vehiculeRepository.findById(id).orElse(null); }

    @Override
    public List<Vehicule> listerTous() { return (List<Vehicule>) vehiculeRepository.findAll(); }

    @Override
    public Vehicule mettreAJour(Vehicule vehicule) { return vehiculeRepository.save(vehicule); }

    @Override
    public void supprimer(Long id) { vehiculeRepository.deleteById(id); }
}
