package ProxyProblem;

import java.util.List;

public class DetentoProxy implements IDetento {

    private Detento detento;

    private Integer codigo;

    public DetentoProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDados() {
        if (this.detento == null) {
            this.detento = new Detento(this.codigo);
        }
        return this.detento.obterDados();
    }

    @Override
    public float obterPena(Guarda guarda) {
        if (!guarda.isChefeSeguranca()) {
            throw new IllegalArgumentException("Guarda não autorizado");
        }
        if (this.detento == null) {
            this.detento = new Detento(this.codigo);
        }
        return this.detento.obterPena(guarda);
    }
}
