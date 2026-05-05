package com.example.lab02final.controller;

import com.example.lab02final.domain.entity.Pirate;
import com.example.lab02final.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pirates")
@RequiredArgsConstructor
public class PirateController {

    private final PirateService pirateService;

    // CREATE
    @PostMapping
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate) {
        return ResponseEntity.ok(pirateService.createPirate(pirate));
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<Pirate>> getAllPirates() {
        return ResponseEntity.ok(pirateService.getAllPirates());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Pirate> getPirateById(@PathVariable UUID id) {
        Pirate pirate = pirateService.getPirateById(id);

        if (pirate == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(pirate);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Pirate> updatePirate(
            @PathVariable UUID id,
            @RequestBody Pirate pirate
    ) {
        Pirate updated = pirateService.updatePirate(id, pirate);

        if (updated == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updated);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Pirate> deletePirate(@PathVariable UUID id) {
        Pirate deleted = pirateService.deletePirate(id);

        if (deleted == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(deleted);
    }
}