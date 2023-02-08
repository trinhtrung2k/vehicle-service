package com.trinhtrung.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trinhtrung.fleetapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
