package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

import java.util.List;

public class ReservationServiceIMPL implements IReservationService {

    ReservationRepository reservationRepository;

    @Override
    public Reservation creer(Reservation reservation) { return reservationRepository.save(reservation); }

    @Override
    public Reservation obtenirParId(Long id) { return reservationRepository.findById(id).orElse(null); }

    @Override
    public List<Reservation> listerTous() { return (List<Reservation>) reservationRepository.findAll(); }

    @Override
    public Reservation mettreAJour(Reservation reservation) { return reservationRepository.save(reservation); }

    @Override
    public void supprimer(Long id) { reservationRepository.deleteById(id); }
}
