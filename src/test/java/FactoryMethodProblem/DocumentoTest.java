package FactoryMethodProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DocumentoTest {

    @Test
    void documentoInexistente() {
        try {
            IDocumento documento = DocumentoFactory.obterDocumento("Video");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Documento inexistente", e.getMessage());
        }
    }

    @Test
    void documentoInvalido() {
        try {
            IDocumento documento = DocumentoFactory.obterDocumento("Audio");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Documento inválido", e.getMessage());
        }
    }

    @Test
    void crudApresentacao() {
        IDocumento documento = DocumentoFactory.obterDocumento("Apresentacao");
        assertEquals("Criada apresentação", documento.criar());
        assertEquals("Aberta apresentação para leitura", documento.ler());
        assertEquals("Aberta apresentação para edição", documento.atualizar());
        assertEquals("Deletada apresentação", documento.deletar());
    }

    @Test
    void crudPlanilha() {
        IDocumento documento = DocumentoFactory.obterDocumento("Planilha");
        assertEquals("Criada planilha", documento.criar());
        assertEquals("Aberta planilha para leitura", documento.ler());
        assertEquals("Aberta planilha para edição", documento.atualizar());
        assertEquals("Deletada planilha", documento.deletar());
    }

    @Test
    void crudTexto() {
        IDocumento documento = DocumentoFactory.obterDocumento("Texto");
        assertEquals("Criado documento de texto", documento.criar());
        assertEquals("Aberto documento de texto para leitura", documento.ler());
        assertEquals("Aberto documento de texto para edição", documento.atualizar());
        assertEquals("Deletado documento de texto", documento.deletar());
    }

    @Test
    void crudAudio(){
        DocumentoAudio documento = new DocumentoAudio();
        assertEquals("Criado documento de áudio", documento.criar());
        assertEquals("Aberto documento de áudio para leitura", documento.ler());
        assertEquals("Aberto documento de áudio para edição", documento.atualizar());
        assertEquals("Deletado documento de áudio", documento.deletar());
    }

}