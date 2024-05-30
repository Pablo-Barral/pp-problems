package MementoProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DocumentoTest {

    @Test
    void armazenarEstados() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoNegrito.getInstance());
        assertEquals(2, documento.getEstados().size());
    }

    @Test
    void formatarTexto() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoNegrito.getInstance());
        assertEquals("negrito", documento.getEstado().getNomeEstado());
        documento.desfazer();
        documento.setEstado(TextoEstadoItalico.getInstance());
        assertEquals("itálico", documento.getEstado().getNomeEstado());
        documento.setEstado(TextoEstadoSublinhado.getInstance());
        assertEquals("sublinhado", documento.getEstado().getNomeEstado());
    }

    @Test
    void desfazerUltimaAcao() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoNegrito.getInstance());
        documento.desfazer();
        assertEquals("digitado", documento.getEstado().getNomeEstado());
    }

    @Test
    void refazerAcaoDesfeita() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoNegrito.getInstance());
        documento.desfazer();
        documento.refazer();
        assertEquals("negrito", documento.getEstado().getNomeEstado());

    }

    @Test
    void continuarDePontoAnterior() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoNegrito.getInstance());
        documento.setEstado(TextoEstadoExcluido.getInstance());
        documento.desfazer();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        assertEquals("digitado", documento.getEstado().getNomeEstado());
        assertEquals(3, documento.getEstados().size());
    }

    @Test
    void retornarExcecao() {
        try {
            Documento documento = new Documento();
            documento.refazer();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}