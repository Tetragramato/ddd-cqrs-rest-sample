package com.tetragramato.domain.adresse.command;

import com.tetragramato.cqrs.core.Command;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseUpdateLigneCommand implements Command {
    private final UUID id;
    private final String ligneAdresse;

    public AdresseUpdateLigneCommand(UUID id, String ligneAdresse) {
        this.ligneAdresse = ligneAdresse;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }
}
