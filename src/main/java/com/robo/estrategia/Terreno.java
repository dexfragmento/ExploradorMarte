package com.robo.estrategia;

/**
 * Created by Filipe Gomes on 03/01/2018.
 */
public class Terreno {

    private Coordenada coordenadasDireitaSuperior = new Coordenada(0, 0);
    private Coordenada coordenadasEsquerdaSuperior = new Coordenada(0, 0);

    public Terreno(final int x, final int y) {
        this.coordenadasDireitaSuperior = this.coordenadasDireitaSuperior.novasCoordenadas(x, y);
    }

    public boolean possuiLimitesInternos(final Coordenada coordenada) {
        return this.coordenadasEsquerdaSuperior.possuiLimitesExternos(coordenada) && this.coordenadasDireitaSuperior.possuiLimitesInternos(coordenada);
    }

}
