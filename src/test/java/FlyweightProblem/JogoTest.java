package FlyweightProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JogoTest {

    @Test
    void retornaTabuleiro() {
        Jogo jogo = new Jogo();
        jogo.logar("Jogador1", "A-1", 100, false, "Suporte", "Roupas Iniciais", "Humano");
        jogo.logar("Jogador2", "C-5", 184, true, "Tanque", "Armadura Pesada", "Ogro");
        jogo.logar("Jogador2", "C-6", 132, true, "Tanque", "Armadura Pesada", "Ogro");

        List<String> saida = Arrays.asList(
                "Joogador Jogador1 {Posição='A-1'HP='100'Fora de combate', Personagem= Classe: Suporte Raça: Humano Armadura: Roupas Iniciais}",
                "Joogador Jogador2 {Posição='C-5'HP='184'Em combate!', Personagem= Classe: Tanque Raça: Ogro Armadura: Armadura Pesada}",
                "Joogador Jogador2 {Posição='C-6'HP='132'Em combate!', Personagem= Classe: Tanque Raça: Ogro Armadura: Armadura Pesada}"
);

        assertEquals(saida, jogo.obterTabuleiro());
    }

    @Test
    void retornaTotalUnidades() {
        Jogo jogo = new Jogo();
        jogo.logar("Jogador1", "A-1", 100, false, "Suporte", "Roupas Iniciais", "Humano");
        jogo.logar("Jogador2", "C-5", 184, true, "Tanque", "Armadura Pesada", "Ogro");
        jogo.logar("Jogador2", "C-6", 132, true, "Tanque", "Armadura Pesada", "Ogro");

        assertEquals(2, UnidadeFactory.getTotalUnidades());
    }

}