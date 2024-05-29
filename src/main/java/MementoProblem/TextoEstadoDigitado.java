package MementoProblem;

public class TextoEstadoDigitado implements TextoEstado {

    private TextoEstadoDigitado() {
    }

    ;
    private static TextoEstadoDigitado instance = new TextoEstadoDigitado();

    public static TextoEstadoDigitado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "digitado";
    }

}

