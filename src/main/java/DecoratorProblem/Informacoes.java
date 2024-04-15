package DecoratorProblem;

public abstract class Informacoes extends NotificacaoDecorator {

    public Informacoes(Notificacao notificacao) {
        super(notificacao);
    }

    public abstract String getCustomizacaoNotificacao();

    public String getNomeEstrutura() {
        return "Informacoes Adicionais";
    }
}
