package FlyweightProblem;

public class Jogador {

    private String nome;
    private String posicao;
    private int saude;
    private boolean statusBatalha;
    private Unidade unidade;

    public Jogador(String nome, String posicao, int saude, boolean statusBatalha, Unidade unidade) {
        this.nome = nome;
        this.posicao = posicao;
        this.saude = saude;
        this.statusBatalha = statusBatalha;
        this.unidade = unidade;
    }

    public String obterJogador() {
        return "Joogador "+ this.nome +" {" +
                "Posição='" + this.posicao + '\'' +
                "HP='" + this.saude + '\'' +
                (this.statusBatalha ?  "Em combate!" :  "Fora de combate") + '\'' +
                ", Personagem= Classe: " + unidade.getTipo() + " Raça: " + unidade.getModelo3D() + " Armadura: " + unidade.getTextura() +
                '}';
    }
}
