package ProxyProblem;

public class Guarda {
    private String nome;
    private boolean chefeSeguranca;

    public Guarda(String nome, boolean chefeSeguranca) {
        this.nome = nome;
        this.chefeSeguranca = chefeSeguranca;
    }

    public boolean isChefeSeguranca() {
        return chefeSeguranca;
    }
}

