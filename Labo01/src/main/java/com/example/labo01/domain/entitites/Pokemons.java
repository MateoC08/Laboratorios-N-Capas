package com.example.labo01.domain.entitites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemons {
    private String nombre;
    private String tipo;
    private List<String> debilidades;
    private List<String> zonas;
    private String region;
}
