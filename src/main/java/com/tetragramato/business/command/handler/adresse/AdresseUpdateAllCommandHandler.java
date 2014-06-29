package com.tetragramato.business.command.handler.adresse;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.cqrs.core.CommandHandler;
import com.tetragramato.domain.adresse.command.AdresseUpdateAllCommand;
import com.tetragramato.domain.aggregate.Adresse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class AdresseUpdateAllCommandHandler implements CommandHandler<AdresseUpdateAllCommand, Adresse> {

    @Autowired
    AdresseRepository adresseRepository;

    static Logger log = Logger.getLogger(AdresseUpdateAllCommandHandler.class);

    @Override
    public Adresse handle(AdresseUpdateAllCommand objectToApply) {
        log.info("[AdresseUpdateAllCommandHandler] debut update all...");
        Adresse adresse = new Adresse();
        adresse.setId(objectToApply.getId());
        adresse.setCodePostal(objectToApply.getCodePostal());
        adresse.setVille(objectToApply.getVille());
        adresse.setLigneAdresse(objectToApply.getLigneAdresse());
        log.info("[AdresseUpdateAllCommandHandler] fin update All adresse.");
        return adresseRepository.updateAdresse(adresse);
    }
}
