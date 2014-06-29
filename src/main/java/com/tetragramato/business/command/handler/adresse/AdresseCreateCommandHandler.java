package com.tetragramato.business.command.handler.adresse;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.cqrs.core.CommandHandler;
import com.tetragramato.domain.adresse.command.AdresseCreateCommand;
import com.tetragramato.domain.aggregate.Adresse;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class AdresseCreateCommandHandler implements CommandHandler<AdresseCreateCommand, Adresse> {

    @Autowired
    AdresseRepository adresseRepository;

    static Logger log = Logger.getLogger(AdresseCreateCommandHandler.class);

    @Override
    public Adresse handle(AdresseCreateCommand objectToApply) {
        log.info("[AdresseCreateCommandHandler] debut creation...");
        Adresse adresse = new Adresse();
        adresse.setId(UUID.randomUUID());
        adresse.setLigneAdresse(objectToApply.getLigneAdresse());
        adresse.setVille(objectToApply.getVille());
        adresse.setCodePostal(objectToApply.getCodePostal());
        log.info("[AdresseCreateCommandHandler] ...Fin creation Adresse.");
        return adresseRepository.createAdresse(adresse);
    }
}
