package com.robo.estrategia;

/**
 * Created by Filipe Gomes on 05/01/2018.
 */
public class Coordenada {

    private int coordenadaX;
    private int coordenadaY;

    public Coordenada(final int coordenadaX, final int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Coordenada novasCoordenadas(final int valorCoordenadaX, final int valorCoordenadaY) {
        return new Coordenada(this.coordenadaX + valorCoordenadaX, this.coordenadaY + valorCoordenadaY);
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        saida.append(coordenadaX);
        saida.append(" ");
        saida.append(coordenadaY);
        return saida.toString();
    }

    public boolean possuiLimitesInternos(final Coordenada coordenada) {
        return limiteExternoCoordenadaX(coordenada.coordenadaX) && limiteExternoCoordenadaY(coordenada.coordenadaY);
    }

    public boolean possuiLimitesExternos(final Coordenada coordenada) {
        return isLimiteExternoCoordenadaX(coordenada.coordenadaX) && isLimiteExternoCoordenadaY(coordenada.coordenadaY);
    }

    private boolean isLimiteExternoCoordenadaX(final int coordenadaX) {
        return coordenadaX >= this.coordenadaX;
    }

    private boolean isLimiteExternoCoordenadaY(final int coordenadaY) {
        return coordenadaY >= this.coordenadaY;
    }

    private boolean limiteExternoCoordenadaY(final int coordenadaY) {
        return coordenadaY <= this.coordenadaY;
    }

    private boolean limiteExternoCoordenadaX(final int coordenadaX) {
        return coordenadaX <= this.coordenadaX;
    }

    public Coordenada novasCoordenadasProximoPasso(final int valorCoordenadaX, final int valorCoordenadaY) {
        return new Coordenada(coordenadaX + valorCoordenadaX, coordenadaY + valorCoordenadaY);
    }

}
