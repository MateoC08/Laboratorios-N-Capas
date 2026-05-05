package com.example.lab02final.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "pirate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pirate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Double bounty;

    private String crew;

    private Boolean isAlive;
}