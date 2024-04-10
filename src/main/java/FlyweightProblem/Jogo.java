package FlyweightProblem;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private List<Jogador> jogadores = new ArrayList<>();

    public void logar(String nome, String posicao, int saude, boolean statusBatalha, String tipo, String textura, String modelo3D) {
        Unidade unidade = UnidadeFactory.getUnidades(tipo, textura, modelo3D);
        Jogador jogador = new Jogador(nome, posicao, saude, statusBatalha, unidade);
        jogadores.add(jogador);
    }

    public List<String> obterTabuleiro() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }


}
