package com.ultproject.cabmed.rdv;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
public class Rdv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false)
    private String nom;
    @Column(nullable=false)
    private String prenom;
    private LocalDateTime data;
    private String tel;
    private String medecin;

    public Rdv() {
    }

    public Rdv(Integer id, String nom, String prenom, LocalDateTime data, String tel, String medecin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.data = data;
        this.tel = tel;
        this.medecin = medecin;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMedecin() {
        return medecin;
    }

    public void setMedecin(String medecin) {
        this.medecin = medecin;
    }
}