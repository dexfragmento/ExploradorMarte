package estrategia;

import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Terreno;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class TerrenoTest {

    @Test
    public void testeLocalizacaoDeCoordenadasDentroDosLimites() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada plateauCoordinates = new Coordenada(5, 0);
        Assert.assertTrue(terreno.possuiLimitesInternos(plateauCoordinates));
    }

    @Test
    public void testePositivoDeLocalizacaoCoordenadasExternasX() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada coordenada = new Coordenada(6, 0);
        Assert.assertFalse(terreno.possuiLimitesInternos(coordenada));
    }

    @Test
    public void testeNegativoDeLocalizacaoCoordenadasExternasX() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada coordenada = new Coordenada(-1, 0);
        Assert.assertFalse(terreno.possuiLimitesInternos(coordenada));
    }

    @Test
    public void testePositivoDeLocalizacaoCoordenadasExternasY() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada coordenada = new Coordenada(0, 6);
        Assert.assertFalse(terreno.possuiLimitesInternos(coordenada));
    }

    @Test
    public void testeNegativoDeLocalizacaoCoordenadasExternasY() {
        Terreno terreno = new Terreno(5, 5);
        Coordenada coordenada = new Coordenada(0, -1);
        Assert.assertFalse(terreno.possuiLimitesInternos(coordenada));
    }
}
