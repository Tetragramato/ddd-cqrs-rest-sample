package com.tetragramato.cqrs.core;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by viviboss on 29/06/2014.
 */
@Component
public class CommandHandlerDispatcher {

    static Logger log = Logger.getLogger(CommandHandlerDispatcher.class);

    public interface HandlersProvider {
        CommandHandler<Object, Object> getHandler(Object command);
    }

    @Autowired
    private HandlersProvider handlerProvider;

    public Object dispatch(Object command) {
        CommandHandler<Object, Object> handler = handlerProvider.getHandler(command);
        log.info(String.format("Dispatch de la commande [%s] sur le CommandHandler : [%s]",command.getClass().getName(),handler.toString()));
        return handler.handle(command);

    }
}
