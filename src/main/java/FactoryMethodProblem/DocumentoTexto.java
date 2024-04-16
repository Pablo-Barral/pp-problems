package FactoryMethodProblem;

public class DocumentoTexto implements IDocumento {

    public String criar() {return "Criado documento de texto";}

    public String ler() {return "Aberto documento de texto para leitura";}

    public String atualizar() {return "Aberto documento de texto para edição";}

    public String deletar() {return "Deletado documento de texto";}
}
