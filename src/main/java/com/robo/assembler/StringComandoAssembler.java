package com.robo.assembler;

import com.robo.comandos.ComandoMover;
import com.robo.comandos.ComandoRotacionarDireita;
import com.robo.comandos.ComandoRotacionarEsquerda;
import com.robo.comandos.Comando;

import java.util.*;

/**
 * Created by Filipe Gomes on 05/01/2018.
 */
public class StringComandoAssembler {

    public static final String PARA_CADA_CARACTERE = "";
    public static final int INICIO_INDICE = 0;

    private static Map<String, Comando> strToComandoMap = new HashMap<String, Comando>() {{
        put("L", new ComandoRotacionarEsquerda());
        put("R", new ComandoRotacionarDireita());
        put("M", new ComandoMover());
    }};

    private String comandoStr;

    public StringComandoAssembler(final String comandoStr) {
        this.comandoStr = comandoStr;
    }

    public List<Comando> toComandos() {
        if (isNullOrEmpty(comandoStr)) return new ArrayList<Comando>();
        return construirListaComandos(comandoStr);
    }

    private List<Comando> construirListaComandos(final String comandoStr) {
        List<Comando> comandos = new ArrayList<Comando>();

        for (String cc : origemCaractereComando(comandoStr)) {
            if (cc == null) break;
            Comando comando = pesquisaComandoEquivalente(cc.toUpperCase());
            comandos.add(comando);
        }

        return comandos;
    }

    private boolean isNullOrEmpty(final String comandoStr) {
        return (null == comandoStr || comandoStr.trim().length() == 0);
    }

    private String[] origemCaractereComando(final String comandoStr) {
        return Arrays.copyOfRange(comandoStr.split(PARA_CADA_CARACTERE), INICIO_INDICE, comandoStr.length() + 1);
    }

    private Comando pesquisaComandoEquivalente(final String comandoStr) {
        return strToComandoMap.get(comandoStr);
    }

}
