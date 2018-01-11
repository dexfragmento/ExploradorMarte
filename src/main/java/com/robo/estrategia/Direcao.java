package com.robo.estrategia;

/**
 * Created by Filipe Gomes on 03/01/2018.
 */
public enum Direcao {

    N(0, 1) {
        @Override
        public Direcao esquerda() {
            return O;
        }

        @Override
        public Direcao direita() {
            return L;
        }
    },

    S(0, -1) {
        @Override
        public Direcao direita() {
            return O;
        }

        @Override
        public Direcao esquerda() {
            return L;
        }
    },

    L(1, 0) {
        @Override
        public Direcao direita() {
            return S;
        }

        @Override
        public Direcao esquerda() {
            return N;
        }
    },

    O(-1, 0) {
        @Override
        public Direcao direita() {
            return N;
        }

        @Override
        public Direcao esquerda() {
            return S;
        }
    };

    private final int passoEixoX;
    private final int passoEixoY;

    Direcao(final int passoEixoX, final int passoEixoY) {
        this.passoEixoX = passoEixoX;
        this.passoEixoY = passoEixoY;
    }

    public abstract Direcao direita();

    public abstract Direcao esquerda();

    public int proximoPassoEixoX() {
        return this.passoEixoX;
    }

    public int proximoPassoEixoY() {
        return this.passoEixoY;
    }

}
