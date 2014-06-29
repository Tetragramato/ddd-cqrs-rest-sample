package com.tetragramato.cqrs.core;

/**
 * Created by viviboss on 29/06/2014.
 */
public interface CommandHandler<C, R> {
    public R handle(C objectToApply);
}
