package com.tetragramato.domain.adresse.command;

import com.tetragramato.cqrs.core.Command;
import org.apache.log4j.Logger;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseUpdateAllCommand implements Command {
    private final UUID id;
    private final String ligneAdresse;
    private final String codePostal;
    private final String Ville;

    static Logger log = Logger.getLogger(AdresseUpdateAllCommand.class);

    public AdresseUpdateAllCommand(UUID id, String ligneAdresse, String codePostal, String ville) {
        log.info("[AdresseUpdateAllCommand] création de la commande.");
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
