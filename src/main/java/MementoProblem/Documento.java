package MementoProblem;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    private TextoEstado estado;
    private List<TextoEstado> memento = new ArrayList<TextoEstado>();

    private  int estadoAtivo = -1;

    public TextoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(TextoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
        this.estadoAtivo += 1;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
        estadoAtivo = indice;
    }

    public void desfazer(){
        restauraEstado(estadoAtivo - 1);
    }

    public void refazer(){
        restauraEstado(estadoAtivo + 1);
    }

    public List<TextoEstado> getEstados() {
        return this.memento;
    }
}
