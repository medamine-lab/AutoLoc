package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation creer(Reservation reservation);

    Reservation obtenirParId(Long id);

    List<Reservation> listerTous();

    Reservation mettreAJour(Reservation reservation);

    void supprimer(Long id);
}
