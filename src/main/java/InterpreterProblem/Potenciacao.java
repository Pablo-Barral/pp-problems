package InterpreterProblem;

public class Potenciacao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Potenciacao(Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return Math.pow(x, y);
    }
}
