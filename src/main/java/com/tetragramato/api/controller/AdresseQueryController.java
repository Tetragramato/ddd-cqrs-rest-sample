package com.tetragramato.api.controller;

import com.tetragramato.domain.aggregate.Adresse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by viviboss on 29/06/2014.
 */
@RestController
@RequestMapping("/adresses")
public class AdresseQueryController {

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Adresse getAdresseById(@PathVariable UUID id) {
        Adresse adresse = new Adresse();
        adresse.setId(id);
        return adresse;
    }
}
