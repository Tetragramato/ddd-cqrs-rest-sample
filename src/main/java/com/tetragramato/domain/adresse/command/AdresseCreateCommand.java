package com.tetragramato.domain.adresse.command;

import com.tetragramato.cqrs.core.Command;
import org.apache.log4j.Logger;

/**
 * Created by viviboss on 29/06/2014.
 */
public class AdresseCreateCommand implements Command {
    private final String ligneAdresse;
    private final String codePostal;
    private final String ville;

    static Logger log = Logger.getLogger(AdresseCreateCommand.class);

    public AdresseCreateCommand(String ligneAdresse, String codePostal, String ville) {
        log.info("[AdresseCreateCommand] création de la commande.");
        this.ligneAdresse = ligneAdresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getLigneAdresse() {
        return ligneAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}
