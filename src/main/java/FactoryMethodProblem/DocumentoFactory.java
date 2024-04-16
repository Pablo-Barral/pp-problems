package FactoryMethodProblem;

public class DocumentoFactory {

    public static IDocumento obterDocumento(String documento) {
        Class classe;
        Object objeto;
        try {
            classe = Class.forName("FactoryMethodProblem.Documento" + documento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Documento inexistente");
        }
        if (!(objeto instanceof IDocumento)) {
            throw new IllegalArgumentException("Documento inválido");
        }
        return (IDocumento) objeto;
    }
}
