package MementoProblem;

public class TextoEstadoItalico implements TextoEstado {

    private TextoEstadoItalico() {
    }

    ;
    private static TextoEstadoItalico instance = new TextoEstadoItalico();

    public static TextoEstadoItalico getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "itálico";
    }

}
