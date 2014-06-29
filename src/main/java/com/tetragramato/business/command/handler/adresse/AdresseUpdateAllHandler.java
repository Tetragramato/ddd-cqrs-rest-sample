package com.tetragramato.business.command.handler.adresse;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.cqrs.core.CommandHandler;
import com.tetragramato.domain.adresse.command.AdresseUpdateAllCommand;
import com.tetragramato.domain.aggregate.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class AdresseUpdateAllHandler implements CommandHandler<AdresseUpdateAllCommand, Adresse> {

    @Autowired
    AdresseRepository adresseRepository;

    @Override
    public Adresse handle(AdresseUpdateAllCommand objectToApply) {
        Adresse adresse = new Adresse();
        adresse.setId(objectToApply.getId());
        adresse.setCodePostal(objectToApply.getCodePostal());
        adresse.setVille(objectToApply.getVille());
        adresse.setLigneAdresse(objectToApply.getLigneAdresse());

        return adresseRepository.updateAdresse(adresse);
    }
}
