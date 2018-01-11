import com.robo.ExploradorMarte;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class ExploradorMarteTest {

    @Test
    public void solicitarLocalizacaoAtual() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(3, 3);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        Assert.assertEquals("3 3 N", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void rotacionarParaEsquerda() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.virarParaEsquerda();
        Assert.assertEquals("1 2 O", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void rotacionarParaDireita() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.virarParaDireita();
        Assert.assertEquals("1 2 L", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void mover() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.mover();
        Assert.assertEquals("1 3 N", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void executarComandoDeRotacaoParaDireita() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.run("R");
        Assert.assertEquals("1 2 L", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void executarComandoDeRotacaoParaEsquerda() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.run("L");
        Assert.assertEquals("1 2 O", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void executarComandoParaMover() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        exploradorMarte.run("M");
        Assert.assertEquals("1 3 N", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void executarComandoComMultiplasInstrucoes() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(3, 3);
        ExploradorMarte exploradorMarte = new ExploradorMarte(terreno, Direcao.L, posicaoInicial);
        exploradorMarte.run("MMRMMRMRRM");
        Assert.assertEquals("5 1 L", exploradorMarte.localizacaoAtual());
    }

    @Test
    public void terrenoDriveOff() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(3, 3);
        ExploradorMarte explorador = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);
        explorador.run("MMMMMMMMMMR");
        Assert.assertEquals("3 5 L", explorador.localizacaoAtual());
    }
}
