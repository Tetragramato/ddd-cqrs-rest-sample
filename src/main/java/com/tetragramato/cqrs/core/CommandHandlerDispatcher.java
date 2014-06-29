package com.tetragramato.cqrs.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class CommandHandlerDispatcher {

    @Autowired
    HandlerProvider handlerProvider;

    public Object dispatch(Object command) {
        CommandHandler<Object, Object> handler = handlerProvider.getHandler(command);
        return handler.handle(command);

    }
}
