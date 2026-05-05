package com.example.lab02final.service;

import com.example.lab02final.domain.entity.Ship;

import java.util.UUID;

public interface ShipService {

    void createShip(Ship ship);

    Ship getShipByName(String name);

    void updateShip(UUID id, Ship ship);

    Ship deleteShip(UUID id);
}