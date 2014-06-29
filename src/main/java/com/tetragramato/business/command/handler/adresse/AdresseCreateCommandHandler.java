package com.tetragramato.business.command.handler.adresse;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.cqrs.core.CommandHandler;
import com.tetragramato.domain.adresse.command.AdresseCreateCommand;
import com.tetragramato.domain.aggregate.Adresse;
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

    @Override
    public Adresse handle(AdresseCreateCommand objectToApply) {
        Adresse adresse = new Adresse();
        adresse.setId(UUID.randomUUID());
        adresse.setLigneAdresse(objectToApply.getLigneAdresse());
        adresse.setVille(objectToApply.getVille());
        adresse.setCodePostal(objectToApply.getCodePostal());
        return adresseRepository.createAdresse(adresse);
    }
}
