package com.tetragramato.domain.aggregate;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class ProprietaireAppartement {
    private UUID id;
    private String nom;
    private String numeroTelephone;

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

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
