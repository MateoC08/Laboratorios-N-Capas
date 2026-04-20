package com.example.labo01.common;

import com.example.labo01.domain.entitites.Pokemons;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaPokemons {
    private final List<Pokemons> pokemons;

    public ListaPokemons(){
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemons.builder()
                .nombre("Pokemon1")
                .tipo("Fuego")
                .debilidades(List.of("Agua", "Roca"))
                .zonas(List.of("Bosque", "Cueva"))
                .region("Kanto")
                .build()
        );

        this.pokemons.add(Pokemons.builder()
                .nombre("Pokemon2")
                .tipo("Agua")
                .debilidades(List.of("Eléctrico", "Planta"))
                .zonas(List.of("Mar", "Lago"))
                .region("Johto")
                .build()
        );

        this.pokemons.add(Pokemons.builder()
                .nombre("Pokemon3")
                .tipo("Planta")
                .debilidades(List.of("Fuego", "Hielo"))
                .zonas(List.of("Hierba Alta", "Bosque"))
                .region("Hoenn")
                .build()
        );

        this.pokemons.add(Pokemons.builder()
                .nombre("Pokemon4")
                .tipo("Eléctrico")
                .debilidades(List.of("Tierra"))
                .zonas(List.of("Ciudad", "Bosque"))
                .region("Kanto")
                .build()
        );

        this.pokemons.add(Pokemons.builder()
                .nombre("Pokemon5")
                .tipo("Roca")
                .debilidades(List.of("Agua", "Planta", "Lucha"))
                .zonas(List.of("Cueva", "Montaña"))
                .region("Sinnoh")
                .build()
        );
    }

    public List<Pokemons> getPokemons() {
        return pokemons;
    }
}