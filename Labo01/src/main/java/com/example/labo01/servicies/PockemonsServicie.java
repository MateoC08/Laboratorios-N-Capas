package com.example.labo01.servicies;

import com.example.labo01.domain.entitites.Pokemons;
import com.example.labo01.repositories.PokemonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PockemonsServicie {

    private final PokemonsRepository pokemonsRepository;

    public List<Pokemons> findAll() {
        return pokemonsRepository.findAll();
    }

    public List<Pokemons> findByTipo(String tipo) {
        return findAll().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemons> findByZona(String zona) {
        return findAll().stream()
                .filter(p -> p.getZonas().contains(zona))
                .collect(Collectors.toList());
    }

    public List<Pokemons> findByDebilidad(String debilidad) {
        return findAll().stream()
                .filter(p -> p.getDebilidades().contains(debilidad))
                .collect(Collectors.toList());
    }
}