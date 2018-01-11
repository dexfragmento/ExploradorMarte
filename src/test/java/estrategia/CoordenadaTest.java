package estrategia;

import com.robo.estrategia.Coordenada;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class CoordenadaTest {

    @Test
    public void incrementoCoordenadaXValorPositivo() {
        Coordenada limite = new Coordenada(2, 3);
        limite = limite.novasCoordenadas(1, 0);
        Assert.assertEquals("3 3", limite.toString());
    }

    @Test
    public void decrementoCoordenadaXValorNegativo() {
        Coordenada limite = new Coordenada(2, 3);
        limite = limite.novasCoordenadas(-1, 0);
        Assert.assertEquals("1 3", limite.toString());
    }

    @Test
    public void incrementoCoordenadaYValorPositivo() {
        Coordenada limite = new Coordenada(2, 3);
        limite = limite.novasCoordenadas(0, 1);
        Assert.assertEquals("2 4", limite.toString());
    }

    @Test
    public void decrementoCoordenadaYValorNegativo() {
        Coordenada limite = new Coordenada(2, 3);
        limite = limite.novasCoordenadas(0, -1);
        Assert.assertEquals("2 2", limite.toString());
    }

    @Test
    public void limiteCoordenadaX() {
        Coordenada limite = new Coordenada(5, 5);
        Coordenada pontoInterno = new Coordenada(4, 5);
        Assert.assertTrue(limite.possuiLimitesInternos(pontoInterno));
    }

    @Test
    public void limiteCoordenadaY() {
        Coordenada limite = new Coordenada(5, 5);
        Coordenada pontoInterno = new Coordenada(5, 4);
        Assert.assertTrue(limite.possuiLimitesInternos(pontoInterno));
    }

    @Test
    public void coordenadaXForaLimite() {
        Coordenada limite = new Coordenada(5, 5);
        Coordenada pontoExterno = new Coordenada(8, 5);
        Assert.assertTrue(limite.possuiLimitesExternos(pontoExterno));
    }

    @Test
    public void coordenadaYForaLimite() {
        Coordenada limite = new Coordenada(5, 5);
        Coordenada pontoExterno = new Coordenada(5, 8);
        Assert.assertTrue(limite.possuiLimitesExternos(pontoExterno));
    }

    @Test
    public void coordenadasImutaveisParaNovosTamanhos() {
        Coordenada limite = new Coordenada(5, 5);
        Coordenada newBoundary = limite.novasCoordenadasProximoPasso(1, -1);
        Assert.assertEquals("6 4", newBoundary.toString());
        Assert.assertEquals("5 5", limite.toString());
    }

}
