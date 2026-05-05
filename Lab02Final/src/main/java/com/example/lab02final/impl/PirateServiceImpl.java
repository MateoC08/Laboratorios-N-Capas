package com.example.lab02final.impl;

import com.example.lab02final.domain.entity.Pirate;
import com.example.lab02final.repository.PirateRepository;
import com.example.lab02final.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {

    private final PirateRepository pirateRepository;

    @Override
    public Pirate createPirate(Pirate pirate) {
        return pirateRepository.save(pirate);
    }

    @Override
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return pirateRepository.findById(id).orElse(null);
    }

    @Override
    public Pirate updatePirate(UUID id, Pirate pirate) {
        Pirate existPirate = pirateRepository.findById(id).orElse(null);

        if (existPirate != null) {
            existPirate.setName(pirate.getName());
            existPirate.setBounty(pirate.getBounty());
            existPirate.setCrew(pirate.getCrew());
            existPirate.setIsAlive(pirate.getIsAlive());

            return pirateRepository.save(existPirate);
        }

        return null;
    }

    @Override
    public Pirate deletePirate(UUID id) {
        Pirate pirate = pirateRepository.findById(id).orElse(null);
        pirateRepository.deleteById(id);
        return pirate;
    }
}