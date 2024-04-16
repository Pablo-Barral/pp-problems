package FactoryMethodProblem;

public class DocumentoPlanilha implements IDocumento {

    public String criar() {return "Criada planilha";}

    public String ler() {return "Aberta planilha para leitura";}

    public String atualizar() {return "Aberta planilha para edição";}

    public String deletar() {return "Deletada planilha";}
}
