package MementoProblem;

public class TextoEstadoFormatado implements TextoEstado {

    private TextoEstadoFormatado() {
    }

    ;
    private static TextoEstadoFormatado instance = new TextoEstadoFormatado();

    public static TextoEstadoFormatado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "formatado";
    }

}
