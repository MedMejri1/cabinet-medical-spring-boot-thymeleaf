package com.ultproject.cabmed.medicament;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String forme;

    private LocalDateTime date_perm;

    public Medicament(Integer id, String nom, String forme, LocalDateTime date_perm) {
        this.id = id;
        this.nom = nom;
        this.forme = forme;
        this.date_perm = date_perm;
    }

    public Medicament() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public LocalDateTime getDate_perm() {
        return date_perm;
    }

    public void setDate_perm(LocalDateTime date_perm) {
        this.date_perm = date_perm;
    }
}
