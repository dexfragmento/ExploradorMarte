package com.robo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Filipe Gomes on 03/01/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Aplicacao {

    public static void main(String args[]) {
        SpringApplication.run(Aplicacao.class, args);
    }

}
