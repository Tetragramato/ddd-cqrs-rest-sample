package com.tetragramato.business.repository.impl;

import com.tetragramato.business.repository.AdresseRepository;
import com.tetragramato.domain.aggregate.Adresse;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class AdresseRepositoryImpl implements AdresseRepository {


    @Override
    public Adresse createAdresse(Adresse adresse) {
        return adresse;
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return adresse;
    }
}
