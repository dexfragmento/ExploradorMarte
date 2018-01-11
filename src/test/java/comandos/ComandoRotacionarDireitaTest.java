package comandos;

import com.robo.ExploradorMarte;
import com.robo.comandos.ComandoRotacionarDireita;
import com.robo.estrategia.Coordenada;
import com.robo.estrategia.Direcao;
import com.robo.estrategia.Terreno;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Filipe Gomes on 09/01/2018.
 */
public class ComandoRotacionarDireitaTest {

    @Test
    public void testeRotacionarParaDireita() {
        ComandoRotacionarDireita comando = new ComandoRotacionarDireita();
        Terreno terreno = new Terreno(5, 5);
        Coordenada posicaoInicial = new Coordenada(1, 2);
        ExploradorMarte explorador = new ExploradorMarte(terreno, Direcao.N, posicaoInicial);

        comando.executar(explorador);

        Assert.assertEquals("1 2 L", explorador.localizacaoAtual());
    }

}
