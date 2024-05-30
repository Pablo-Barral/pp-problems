package MementoProblem;

public class TextoEstadoNegrito implements TextoEstado {

    private TextoEstadoNegrito() {
    }

    ;
    private static TextoEstadoNegrito instance = new TextoEstadoNegrito();

    public static TextoEstadoNegrito getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "negrito";
    }

}
