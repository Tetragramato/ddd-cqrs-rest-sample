package com.tetragramato.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

/**
 * Created by viviboss on 29/06/2014.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tetragramato")
public class AppConfig {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AppConfig.class, args);
    }


}
