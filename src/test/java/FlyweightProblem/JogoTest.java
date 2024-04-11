package FlyweightProblem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JogoTest {

    @Test
    void retornaTabuleiro() {
        Jogo jogo = new Jogo();
        jogo.criar("A-1", 100, false, new Suporte());
        jogo.criar("C-5", 98, true, new Suporte());
        jogo.criar("C-6", 132, true, new Dano());
        jogo.criar("B-2", 150, false, new Dano());
        jogo.criar("B-7", 250, false, new Tanque());

        List<String> saida = Arrays.asList(
                "Exército {Posição='A-1'Saúde do esquadrão='100'Fora de combate', Personagem= Classe: Suporte Raça: Elfo Armadura: Armadura Leve}",
                "Exército {Posição='C-5'Saúde do esquadrão='98'Em combate!', Personagem= Classe: Suporte Raça: Elfo Armadura: Armadura Leve}",
                "Exército {Posição='C-6'Saúde do esquadrão='132'Em combate!', Personagem= Classe: Dano Raça: Humano Armadura: Armadura Média}",
                "Exército {Posição='B-2'Saúde do esquadrão='150'Fora de combate', Personagem= Classe: Dano Raça: Humano Armadura: Armadura Média}",
                "Exército {Posição='B-7'Saúde do esquadrão='250'Fora de combate', Personagem= Classe: Tanque Raça: Ogro Armadura: Armadura Pesada}");

        assertEquals(saida, jogo.obterTabuleiro());
    }

    @Test
    void retornaTotalUnidades() {
        Jogo jogo = new Jogo();
        jogo.criar("A-1", 100, false, new Suporte());
        jogo.criar("C-5", 98, true, new Suporte());
        jogo.criar("C-6", 132, true, new Dano());
        jogo.criar("B-2", 150, false, new Dano());
        jogo.criar("B-7", 250, false, new Tanque());

        assertEquals(3, UnidadeFactory.getTotalUnidades());
    }

}