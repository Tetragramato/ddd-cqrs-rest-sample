package com.tetragramato.api.controller;

import com.tetragramato.cqrs.core.Command;
import com.tetragramato.cqrs.core.CommandHandlerDispatcher;
import com.tetragramato.domain.adresse.command.AdresseCreateCommand;
import com.tetragramato.domain.adresse.command.AdresseUpdateAllCommand;
import com.tetragramato.domain.adresse.command.AdresseUpdateLigneCommand;
import com.tetragramato.domain.adresse.request.AdresseRequest;
import com.tetragramato.domain.adresse.request.AdresseUpdateRequest;
import com.tetragramato.domain.adresse.type.TypeCommandAdresse;
import com.tetragramato.domain.aggregate.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by viviboss on 29/06/2014.
 */
@RestController
@RequestMapping("/adresses")
public class AdresseCommandController {

    @Autowired
    CommandHandlerDispatcher commandHandlerDispatcher;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Adresse> insertAdresse(@RequestBody AdresseRequest adresseRequest, UriComponentsBuilder builder) {
        AdresseCreateCommand adresseCreateCommand = new AdresseCreateCommand(adresseRequest.getLigneAdresse(), adresseRequest.getCodePostal(), adresseRequest.getVille());
        Adresse adresseCreated = (Adresse) commandHandlerDispatcher.dispatch(adresseCreateCommand);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(
                builder.path("/adresses/{id}")
                        .buildAndExpand(adresseCreated.getId()).toUri());

        return new ResponseEntity<>(adresseCreated, headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    @ResponseBody
    public ResponseEntity<Adresse> updateAdresse(@RequestBody AdresseUpdateRequest adresseUpdateRequest, UriComponentsBuilder builder) {

        Command command;
        switch (TypeCommandAdresse.getByValue(adresseUpdateRequest.getCommand())) {
            case UPDATE_ALL:
                command = new AdresseUpdateAllCommand(adresseUpdateRequest.getId(), adresseUpdateRequest.getLigneAdresse(), adresseUpdateRequest.getCodePostal(), adresseUpdateRequest.getVille());
                break;
            case UPDATE_LIGNE:
                command = new AdresseUpdateLigneCommand(adresseUpdateRequest.getId(), adresseUpdateRequest.getLigneAdresse());
                break;
            default:
                throw new IllegalArgumentException("La commande n'existe pas");
        }
        Adresse adresseUpdated = (Adresse) commandHandlerDispatcher.dispatch(command);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(
                builder.path("/adresses/{id}")
                        .buildAndExpand(adresseUpdated.getId()).toUri());

        return new ResponseEntity<>(adresseUpdated, headers, HttpStatus.OK);
    }

}
