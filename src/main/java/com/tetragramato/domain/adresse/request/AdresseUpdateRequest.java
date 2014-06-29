package com.tetragramato.domain.adresse.request;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseUpdateRequest {

    private String command;
    private UUID id;
    private String ligneAdresse;
    private String codePostal;
    private String ville;

    public AdresseUpdateRequest() {
    }

    ;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }

    public void setLigneAdresse(String ligneAdresse) {
        this.ligneAdresse = ligneAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
