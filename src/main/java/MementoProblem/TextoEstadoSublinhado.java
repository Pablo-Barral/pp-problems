package MementoProblem;

public class TextoEstadoSublinhado implements TextoEstado {

    private TextoEstadoSublinhado() {
    }

    ;
    private static TextoEstadoSublinhado instance = new TextoEstadoSublinhado();

    public static TextoEstadoSublinhado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "sublinhado";
    }

}
