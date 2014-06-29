package com.tetragramato.domain.adresse.command;

import com.tetragramato.cqrs.core.Command;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseUpdateAllCommand implements Command {
    private final UUID id;
    private final String ligneAdresse;
    private final String codePostal;
    private final String Ville;

    public AdresseUpdateAllCommand(UUID id, String ligneAdresse, String codePostal, String ville) {
        this.id = id;
        this.ligneAdresse = ligneAdresse;
        this.codePostal = codePostal;
        Ville = ville;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }

    public UUID getId() {
        return id;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return Ville;
    }
}
