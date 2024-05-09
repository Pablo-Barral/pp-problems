package InterpreterProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InterpretadorExpressaoTest {
    @Test
    void deveCalcularExpressaoSomaParentesesSimples() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 + ( 2 * 2 ) + 2");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSomaParentesesMultiplos() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 + ( 2 * 2 ) + ( 2 + 2 ) + 2");
        assertEquals(16.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 + 2");
        assertEquals(8.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 - 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 * 2");
        assertEquals(12.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoPotenciacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 ^ 2");
        assertEquals(36.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("6 / 2");
        assertEquals(3.0, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 = 2");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 +");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }


}