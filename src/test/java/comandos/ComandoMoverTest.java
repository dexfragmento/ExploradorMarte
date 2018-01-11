package comandos;

import com.robo.ExploradorMarte;
import com.robo.comandos.ComandoMover;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class ComandoMoverTest {

    @Test
    public void testeMoverObjetoNavegavel() {
        ComandoMover comando = new ComandoMover();
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(2, 3);
        ExploradorMarte explorador = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);

        comando.executar(explorador);

        Assert.assertEquals("2 4 N", explorador.localizacaoAtual());
    }

}
