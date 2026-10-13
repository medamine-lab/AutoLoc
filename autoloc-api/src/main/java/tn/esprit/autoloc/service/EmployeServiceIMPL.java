package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

public class EmployeServiceIMPL implements IEmployeService {

    EmployeRepository employeRepository;

    @Override
    public Employe creer(Employe employe) { return employeRepository.save(employe); }

    @Override
    public Employe obtenirParId(Long id) { return employeRepository.findById(id).orElse(null); }

    @Override
    public List<Employe> listerTous() { return (List<Employe>) employeRepository.findAll(); }

    @Override
    public Employe mettreAJour(Employe employe) { return employeRepository.save(employe); }

    @Override
    public void supprimer(Long id) { employeRepository.deleteById(id); }
}
