package estrategia;

import com.robo.estrategia.Direcao;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class DirecaoTest {

    @Test
    public void oesteEsquerdaNorte() {
        Direcao norte = Direcao.N;
        Direcao west = norte.esquerda();
        Assert.assertEquals(Direcao.O, west);
    }

    @Test
    public void lesteDireitaNorte() {
        Direcao norte = Direcao.N;
        Direcao leste = norte.direita();
        Assert.assertEquals(Direcao.L, leste);
    }

    @Test
    public void norteDireitaOeste() {
        Direcao west = Direcao.O;
        Direcao norte = west.direita();
        Assert.assertEquals(Direcao.N, norte);
    }

    @Test
    public void sulEsquerdaOeste() {
        Direcao west = Direcao.O;
        Direcao sul = west.esquerda();
        Assert.assertEquals(Direcao.S, sul);
    }

    @Test
    public void lesteEsquerdaSul() {
        Direcao sul = Direcao.S;
        Direcao leste = sul.esquerda();
        Assert.assertEquals(Direcao.L, leste);
    }

    @Test
    public void oesteDireitaSul() {
        Direcao sul = Direcao.S;
        Direcao west = sul.direita();
        Assert.assertEquals(Direcao.O, west);
    }

    @Test
    public void norteEsquerdaLeste() {
        Direcao leste = Direcao.L;
        Direcao norte = leste.esquerda();
        Assert.assertEquals(Direcao.N, norte);
    }

    @Test
    public void sulDireitaLeste() {
        Direcao leste = Direcao.L;
        Direcao sul = leste.direita();
        Assert.assertEquals(Direcao.S, sul);
    }

    @Test
    public void lesteUmPassoEixoX() {
        Direcao leste = Direcao.L;
        int stepSize = leste.proximoPassoEixoX();
        Assert.assertEquals(1, stepSize);
    }

    @Test
    public void lesteEixoY() {
        Direcao leste = Direcao.L;
        int stepSize = leste.proximoPassoEixoY();
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void oesteUmPassoAtrasEixoX() {
        Direcao west = Direcao.O;
        int stepSize = west.proximoPassoEixoX();
        Assert.assertEquals(-1, stepSize);
    }


    @Test
    public void oesteEixoY() {
        Direcao west = Direcao.O;
        int stepSize = west.proximoPassoEixoY();
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void norteUmPassoAfrenteEixoY() {
        Direcao norte = Direcao.N;
        int stepSize = norte.proximoPassoEixoY();
        Assert.assertEquals(1, stepSize);
    }

    @Test
    public void norteEixoX() {
        Direcao norte = Direcao.N;
        int stepSize = norte.proximoPassoEixoX();
        Assert.assertEquals(0, stepSize);
    }

    @Test
    public void sulUmPassoAtrasEixoY() {
        Direcao sul = Direcao.S;
        int stepSize = sul.proximoPassoEixoY();
        Assert.assertEquals(-1, stepSize);
    }

    @Test
    public void sulEixoX() {
        Direcao sul = Direcao.S;
        int stepSize = sul.proximoPassoEixoX();
        Assert.assertEquals(0, stepSize);
    }
}
