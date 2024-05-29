package MementoProblem;

public class TextoEstadoExcluido implements TextoEstado {

    private TextoEstadoExcluido() {
    }

    ;
    private static TextoEstadoExcluido instance = new TextoEstadoExcluido();

    public static TextoEstadoExcluido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "excluído";
    }

}
