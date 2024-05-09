package InterpreterProblem;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressoesAritmeticas implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressoesAritmeticas(String contexto) {

        String auxiliar = "";
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();
        
        if(elementos.contains("(")){
            while(iterator.hasNext()){
                String elemento = iterator.next();
                if(elemento.equals("(")){
                    elemento = iterator.next();
                    String interpretarParenteses = "";
                    while (!elemento.equals(")")){
                        interpretarParenteses += elemento + " ";
                        elemento = iterator.next();
                    }
                    InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(interpretarParenteses);
                    double resultado = interpretador.interpretar();
                    auxiliar = contexto.replace("( " + interpretarParenteses + ")", String.valueOf(resultado));
                    contexto = auxiliar;
                }
            }
            elementos = Arrays.asList(auxiliar.split(" "));
            iterator = elementos.iterator();
        }

        Stack<InterpretadorExpressao> pilhaInterpretadores = new Stack<>();

        
        while (iterator.hasNext()) {
            String elemento = iterator.next();
             if (elemento.matches("\\d+(\\.\\d*)?")) {
                pilhaInterpretadores.push(new Numero(Double.parseDouble(elemento)));
            } else if (elemento.equals("+")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Adicao interpretador = new Adicao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("-")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Subtracao interpretador = new Subtracao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("*")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Multiplicacao interpretador = new Multiplicacao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("/")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                Divisao interpretador = new Divisao(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
            } else if (elemento.equals("^")) {
                 if (!iterator.hasNext())
                     throw new IllegalArgumentException("Expressão inválida");
                 Numero elementoEsquerda = (Numero) pilhaInterpretadores.pop();
                 Numero elementoDireita = new Numero(Double.parseDouble(iterator.next()));
                 Potenciacao interpretador = new Potenciacao(elementoEsquerda, elementoDireita);
                 pilhaInterpretadores.push(new Numero(interpretador.interpretar()));
             } else {
                throw new IllegalArgumentException("Expressão com elemento inválido");
            }
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    public double interpretar() {
        return interpretadorInicial.interpretar();
    }
}
