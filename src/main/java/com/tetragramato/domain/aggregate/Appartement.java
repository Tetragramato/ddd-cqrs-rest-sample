package com.tetragramato.domain.aggregate;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class Appartement {
    private UUID id;
    private String lot;
    private int nombrePieces;
    private boolean libre;
    private boolean location;
    private ProprietaireAppartement proprietaireAppartement;
    private Adresse adresse;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public int getNombrePieces() {
        return nombrePieces;
    }

    public void setNombrePieces(int nombrePieces) {
        this.nombrePieces = nombrePieces;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public boolean isLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    public ProprietaireAppartement getProprietaireAppartement() {
        return proprietaireAppartement;
    }

    public void setProprietaireAppartement(ProprietaireAppartement proprietaireAppartement) {
        this.proprietaireAppartement = proprietaireAppartement;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
