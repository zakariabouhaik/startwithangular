package com.example.salesmasterbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_complet")
    private String nomComplet;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "tel")
    private String tel;
}
