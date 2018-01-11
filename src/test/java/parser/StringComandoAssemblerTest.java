package parser;

import com.robo.assembler.StringComandoAssembler;
import com.robo.comandos.Comando;
import com.robo.comandos.ComandoMover;
import com.robo.comandos.ComandoRotacionarDireita;
import com.robo.comandos.ComandoRotacionarEsquerda;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class StringComandoAssemblerTest {

    @Test
    public void stringComandoDeRotacaoParaEsquerda() {
        StringComandoAssembler parser = new StringComandoAssembler("L");
        List<Comando> comandos = parser.toComandos();
        Assert.assertTrue(comandos.get(0) instanceof ComandoRotacionarEsquerda);
        Assert.assertEquals(1, comandos.size());
    }

    @Test
    public void stringComandoDeRotacaoParaDireita() {
        StringComandoAssembler parser = new StringComandoAssembler("R");
        List<Comando> commands = parser.toComandos();
        Assert.assertTrue(commands.get(0) instanceof ComandoRotacionarDireita);
    }

    @Test
    public void stringComandoDeMovimento() {
        StringComandoAssembler parser = new StringComandoAssembler("M");
        List<Comando> comandos = parser.toComandos();
        Assert.assertTrue(comandos.get(0) instanceof ComandoMover);
    }


    @Test
    public void testeListaDeComandosVazia() {
        StringComandoAssembler parser = new StringComandoAssembler("");
        List<Comando> comandos = parser.toComandos();
        Assert.assertEquals(0, comandos.size());
    }


    @Test
    public void testeListaDeComandosNula() {
        StringComandoAssembler parser = new StringComandoAssembler(null);
        List<Comando> comandos = parser.toComandos();
        Assert.assertEquals(0, comandos.size());
    }

    @Test
    public void testeComandoCaseSensitive() {
        StringComandoAssembler parser = new StringComandoAssembler("mM");
        List<Comando> comandos = parser.toComandos();
        Assert.assertTrue(comandos.get(0) instanceof ComandoMover);
        Assert.assertTrue(comandos.get(1) instanceof ComandoMover);
    }

    @Test
    public void testeComandosNaMesmaOrdem() {
        StringComandoAssembler parser = new StringComandoAssembler("MRL");
        List<Comando> comandos = parser.toComandos();
        Assert.assertTrue(comandos.get(0) instanceof ComandoMover);
        Assert.assertTrue(comandos.get(1) instanceof ComandoRotacionarDireita);
        Assert.assertTrue(comandos.get(2) instanceof ComandoRotacionarEsquerda);
    }

}
