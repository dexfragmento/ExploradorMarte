package com.robo.comandos;

import com.robo.ExploradorMarte;

/**
 * Created by Filipe Gomes on 03/01/2018.
 */
public class ComandoMover implements Comando {

    @Override
    public void executar(final ExploradorMarte rover) {
        rover.mover();
    }

}
