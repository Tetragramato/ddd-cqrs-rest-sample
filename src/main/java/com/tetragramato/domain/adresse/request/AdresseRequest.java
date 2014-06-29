package com.tetragramato.domain.adresse.request;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseRequest {
    private String command;
    private String ligneAdresse;
    private String codePostal;
    private String ville;

    public AdresseRequest() {
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
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
