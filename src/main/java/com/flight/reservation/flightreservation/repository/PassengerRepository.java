package com.flight.reservation.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.reservation.flightreservation.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long>{

}
