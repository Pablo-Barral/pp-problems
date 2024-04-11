package FlyweightProblem;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private List<Exercito> exercitos = new ArrayList<>();

    public void criar(String posicao, int saude, boolean statusBatalha, Unidade classe) {
        Unidade unidade = UnidadeFactory.getUnidades(classe.tipo);
        Exercito exercito = new Exercito(posicao, saude, statusBatalha, unidade);
        exercitos.add(exercito);
    }

    public List<String> obterTabuleiro() {
        List<String> saida = new ArrayList<String>();
        for (Exercito exercito : this.exercitos) {
            saida.add(exercito.obterExercito());
        }
        return saida;
    }


}
