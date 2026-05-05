package com.example.lab02final.repository;

import com.example.lab02final.domain.entity.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShipRepository extends JpaRepository<Ship, UUID> {

    Ship findByName(String name);

    Ship findByCaptain(String captain);
}