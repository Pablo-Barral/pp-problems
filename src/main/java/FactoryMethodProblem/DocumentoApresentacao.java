package FactoryMethodProblem;

public class DocumentoApresentacao implements IDocumento {

    public String criar() {return "Criada apresentação";}

    public String ler() {return "Aberta apresentação para leitura";}

    public String atualizar() {return "Aberta apresentação para edição";}

    public String deletar() {return "Deletada apresentação";}
}