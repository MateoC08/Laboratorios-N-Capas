package com.example.labo01;

import com.example.labo01.servicies.PockemonsServicie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Labo01Application.class, args);
    }

    @Bean
    public CommandLineRunner run(PockemonsServicie service) {
        return args -> {

            System.out.println("=== FILTRO POR TIPO (Fuego) ===");
            service.findByTipo("Fuego").forEach(p ->
                    System.out.println("[PKMN] Nombre: " + p.getNombre()
                            + " | Tipo: " + p.getTipo()
                            + " | Debilidades: " + String.join(", ", p.getDebilidades()))
            );

            System.out.println("\n=== FILTRO POR ZONA (Bosque) ===");
            service.findByZona("Bosque").forEach(p ->
                    System.out.println("[PKMN] Nombre: " + p.getNombre()
                            + " | Tipo: " + p.getTipo()
                            + " | Debilidades: " + String.join(", ", p.getDebilidades()))
            );

            System.out.println("\n=== FILTRO POR DEBILIDAD (Agua) ===");
            service.findByDebilidad("Agua").forEach(p ->
                    System.out.println("[PKMN] Nombre: " + p.getNombre()
                            + " | Tipo: " + p.getTipo()
                            + " | Debilidades: " + String.join(", ", p.getDebilidades()))
            );
        };
    }
}