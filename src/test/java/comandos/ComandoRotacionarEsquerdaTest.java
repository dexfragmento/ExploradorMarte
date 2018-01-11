package comandos;

import com.robo.ExploradorMarte;
import com.robo.comandos.ComandoRotacionarEsquerda;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class ComandoRotacionarEsquerdaTest {

    @Test
    public void testeRotacionarParaEsquerda() {
        ComandoRotacionarEsquerda comando = new ComandoRotacionarEsquerda();
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte explorador = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);

        comando.executar(explorador);

        Assert.assertEquals("1 2 O", explorador.localizacaoAtual());
    }

}
