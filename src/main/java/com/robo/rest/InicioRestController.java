package com.robo.rest;

import com.robo.ExploradorMarte;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Filipe Gomes on 03/01/2018.
 */
@RestController
@RequestMapping("/rest")
public class InicioRestController {

    @RequestMapping(value = "/mars/{direcao}", method = RequestMethod.GET)
    public String controle(@PathVariable("direcao") final String direcao, HttpServletResponse response) throws Exception {
        try {
            final Terreno terreno = new Terreno(5, 5);
            final Coordenada posicaoInicial = new Coordenada(0, 0);
            final ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
            exploradorMarte.run(direcao);
            return exploradorMarte.localizacaoAtual();
        } catch (final Exception e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        return null;
    }

}
