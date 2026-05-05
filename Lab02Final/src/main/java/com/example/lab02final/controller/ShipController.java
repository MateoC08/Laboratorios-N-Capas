package com.example.lab02final.controller;

import com.example.lab02final.domain.entity.Ship;
import com.example.lab02final.impl.ShipServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/ship")
@AllArgsConstructor
public class ShipController {

    private final ShipServiceImpl shipService;

    @PostMapping("/create")
    public ResponseEntity<Ship> createShip(@RequestBody Ship ship) {
        shipService.createShip(ship);
        return ResponseEntity.status(HttpStatus.CREATED).body(ship);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<Ship> getShip(@PathVariable String name) {
        return ResponseEntity.ok(shipService.getShipByName(name));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Ship> updateShip(@PathVariable UUID id,
                                           @RequestBody Ship ship) {
        shipService.updateShip(id, ship);
        return ResponseEntity.ok(ship);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Ship> deleteShip(@PathVariable UUID id) {
        return ResponseEntity.ok(shipService.deleteShip(id));
    }
}
