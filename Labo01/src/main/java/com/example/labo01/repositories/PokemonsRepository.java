package com.example.labo01.repositories;

import com.example.labo01.common.ListaPokemons;
import com.example.labo01.domain.entitites.Pokemons;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonsRepository {
    private final ListaPokemons listaPokemons;

    public List<Pokemons> findAll(){return listaPokemons.getPokemons();}
}
