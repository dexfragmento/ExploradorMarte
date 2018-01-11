package com.robo;

import com.robo.comandos.Comando;
import com.robo.assembler.StringComandoAssembler;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Filipe Gomes on 06/01/2018.
 */
public class ExploradorMarte {

    private Coordenada coordenada;
    private Direcao direcao;
    private Terreno terreno;


    public ExploradorMarte(final Terreno terreno, final Direcao direcao, final Coordenada coordenada) {
        this.terreno = terreno;
        this.direcao = direcao;
        this.coordenada = coordenada;
    }

    public void run(final String comandoStr) {
        List<Comando> comandos = new StringComandoAssembler(comandoStr).toComandos();
        for (Comando comando : comandos) {
            comando.executar(this);
        }
    }

    public String localizacaoAtual() {
        return coordenada.toString() + " " + direcao.toString();
    }

    public void virarParaDireita() {
        this.direcao = this.direcao.direita();
    }

    public void virarParaEsquerda() {
        this.direcao = this.direcao.esquerda();
    }

    public void mover() {
        final Coordenada posicaoAposMovimento = coordenada.novasCoordenadasProximoPasso(direcao.proximoPassoEixoX(), direcao.proximoPassoEixoY());

        if (terreno.possuiLimitesInternos(posicaoAposMovimento))
            coordenada = coordenada.novasCoordenadas(direcao.proximoPassoEixoX(), direcao.proximoPassoEixoY());
    }
}
