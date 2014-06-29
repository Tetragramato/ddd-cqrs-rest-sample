package com.tetragramato.business.repository;

import com.tetragramato.domain.aggregate.Adresse;

/**
 * Created by viviboss on 29/06/2014.
 */
public interface AdresseRepository {
    public Adresse createAdresse(Adresse adresse);

    public Adresse updateAdresse(Adresse adresse);

}
