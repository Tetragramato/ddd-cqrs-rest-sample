package com.tetragramato.cqrs.core;

/**
 * Created by viviboss on 29/06/2014.
 */
public interface HandlerProvider {

    CommandHandler<Object, Object> getHandler(Object command);

}
