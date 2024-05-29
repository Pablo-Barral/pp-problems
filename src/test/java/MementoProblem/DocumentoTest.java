package MementoProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DocumentoTest {

    @Test
    void armazenarEstados() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoFormatado.getInstance());
        assertEquals(2, documento.getEstados().size());
    }

    @Test
    void desfazerUltimaAcao() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoFormatado.getInstance());
        documento.desfazer();
        assertEquals("digitado", documento.getEstado().getNomeEstado());
    }

    @Test
    void refazerAcaoDesfeita() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoFormatado.getInstance());
        documento.desfazer();
        documento.refazer();
        assertEquals("formatado", documento.getEstado().getNomeEstado());

    }

    @Test
    void chegarAcaoDesejada() {
        Documento documento = new Documento();
        documento.setEstado(TextoEstadoDigitado.getInstance());
        documento.setEstado(TextoEstadoFormatado.getInstance());
        documento.setEstado(TextoEstadoExcluido.getInstance());
        documento.desfazer();
        documento.desfazer();
        documento.refazer();
        documento.refazer();
        assertEquals("excluído", documento.getEstado().getNomeEstado());

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