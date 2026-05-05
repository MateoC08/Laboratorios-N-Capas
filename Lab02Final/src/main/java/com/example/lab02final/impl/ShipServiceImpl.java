package com.example.lab02final.impl;

import com.example.lab02final.domain.entity.Ship;
import com.example.lab02final.repository.ShipRepository;
import com.example.lab02final.service.ShipService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ShipServiceImpl implements ShipService {

    private final ShipRepository shipRepository;

    @Override
    public void createShip(Ship ship) {
        shipRepository.save(ship);
    }

    @Override
    public Ship getShipByName(String name) {
        return shipRepository.findByName(name);
    }

    @Override
    public void updateShip(UUID id, Ship ship) {
        Ship existShip = shipRepository.findById(id).orElse(null);

        if (existShip != null) {
            existShip.setName(ship.getName());
            existShip.setCaptain(ship.getCaptain());
            existShip.setOcean(ship.getOcean());
            existShip.setCrewSize(ship.getCrewSize());

            shipRepository.save(existShip);
        }
    }

    @Override
    public Ship deleteShip(UUID id) {
        Ship ship = shipRepository.findById(id).orElse(null);
        shipRepository.deleteById(id);
        return ship;
    }
}