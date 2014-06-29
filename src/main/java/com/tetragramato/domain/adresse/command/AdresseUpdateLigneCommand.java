package com.tetragramato.domain.adresse.command;

import com.tetragramato.cqrs.core.Command;
import org.apache.log4j.Logger;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseUpdateLigneCommand implements Command {
    private final UUID id;
    private final String ligneAdresse;

    static Logger log = Logger.getLogger(AdresseUpdateLigneCommand.class);

    public AdresseUpdateLigneCommand(UUID id, String ligneAdresse) {
        log.info("[AdresseUpdateLigneCommand] création de la commande.");
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
