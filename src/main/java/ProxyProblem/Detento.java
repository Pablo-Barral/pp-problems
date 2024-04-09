package ProxyProblem;

import java.util.Arrays;
import java.util.List;

public class Detento implements IDetento {

    private Integer codigo;
    private String nome;
    private String cela;
    private Float pena;

    public Detento(int codigo) {
        this.codigo = codigo;
        Detento detento = BD.getDetento(codigo);
        this.nome = detento.nome;
        this.cela = detento.cela;
        this.pena = detento.pena;
    }

    public Detento(Integer codigo, String nome, String cela, Float pena) {
        this.codigo = codigo;
        this.nome = nome;
        this.cela = cela;
        this.pena = pena;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.cela);
    }

    @Override
    public float obterPena(Guarda guarda) {return this.pena; }
}
