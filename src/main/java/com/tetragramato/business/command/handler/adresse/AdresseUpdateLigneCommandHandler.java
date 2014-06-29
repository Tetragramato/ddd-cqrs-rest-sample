package com.tetragramato.business.command.handler.adresse;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.cqrs.core.CommandHandler;
import com.tetragramato.domain.adresse.command.AdresseUpdateLigneCommand;
import com.tetragramato.domain.adresse.request.AdresseUpdateRequest;
import com.tetragramato.domain.aggregate.Adresse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class AdresseUpdateLigneCommandHandler implements CommandHandler<AdresseUpdateLigneCommand, Adresse> {

    @Autowired
    AdresseRepository adresseRepository;

    static Logger log = Logger.getLogger(AdresseUpdateLigneCommandHandler.class);

    @Override
    public Adresse handle(AdresseUpdateLigneCommand objectToApply) {
        log.info("[AdresseUpdateLigneommandHandler] debut update Ligne Adresse...");
        Adresse adresse = new Adresse();
        adresse.setId(objectToApply.getId());
        adresse.setLigneAdresse(objectToApply.getLigneAdresse());
        log.info("[AdresseUpdateLigneCommandHandler] ... Fin update ligne adresse.");
        return adresseRepository.updateAdresse(adresse);
    }
}
