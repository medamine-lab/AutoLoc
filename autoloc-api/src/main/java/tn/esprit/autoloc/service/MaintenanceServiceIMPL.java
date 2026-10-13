package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;

public class MaintenanceServiceIMPL implements IMaintenanceService {

    MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance creer(Maintenance maintenance) { return maintenanceRepository.save(maintenance); }

    @Override
    public Maintenance obtenirParId(Long id) { return maintenanceRepository.findById(id).orElse(null); }

    @Override
    public List<Maintenance> listerTous() { return (List<Maintenance>) maintenanceRepository.findAll(); }

    @Override
    public Maintenance mettreAJour(Maintenance maintenance) { return maintenanceRepository.save(maintenance); }

    @Override
    public void supprimer(Long id) { maintenanceRepository.deleteById(id); }
}
