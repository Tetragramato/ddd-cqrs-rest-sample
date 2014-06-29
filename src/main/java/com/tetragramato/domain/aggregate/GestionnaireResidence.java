package com.tetragramato.domain.aggregate;

import java.util.List;
import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class GestionnaireResidence {
    private UUID id;
    private String nom;
    private Adresse adresse;
    private List<Residence> residences;

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

    public List<Residence> getResidences() {
        return residences;
    }

    public void setResidences(List<Residence> residences) {
        this.residences = residences;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
