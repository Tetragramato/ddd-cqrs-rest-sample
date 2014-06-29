package com.tetragramato.domain.aggregate;

import java.util.List;
import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class Residence {
    private UUID id;
    private String nom;
    private List<Adresse> adresses;
    private int nombreLogements;
    private int nombreLogementsLibres;
    private int nombreLogementsLoues;
    private List<Appartement> appartements;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    public int getNombreLogements() {
        return nombreLogements;
    }

    public void setNombreLogements(int nombreLogements) {
        this.nombreLogements = nombreLogements;
    }

    public int getNombreLogementsLibres() {
        return nombreLogementsLibres;
    }

    public void setNombreLogementsLibres(int nombreLogementsLibres) {
        this.nombreLogementsLibres = nombreLogementsLibres;
    }

    public int getNombreLogementsLoues() {
        return nombreLogementsLoues;
    }

    public void setNombreLogementsLoues(int nombreLogementsLoues) {
        this.nombreLogementsLoues = nombreLogementsLoues;
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }

    public void setAppartements(List<Appartement> appartements) {
        this.appartements = appartements;
    }
}
