package FlyweightProblem;

public class Exercito {

    private String posicao;
    private int saude;
    private boolean statusBatalha;
    private Unidade unidade;

    public Exercito(String posicao, int saude, boolean statusBatalha, Unidade unidade) {
        this.posicao = posicao;
        this.saude = saude;
        this.statusBatalha = statusBatalha;
        this.unidade = unidade;
    }

    public String obterExercito() {
        return "Exército {" +
                "Posição='" + this.posicao + '\'' +
                "Saúde do esquadrão='" + this.saude + '\'' +
                (this.statusBatalha ?  "Em combate!" :  "Fora de combate") + '\'' +
                ", Personagem= Classe: " + unidade.getTipo() + " Raça: " + unidade.getModelo3D() + " Armadura: " + unidade.getTextura() +
                '}';
    }
}
