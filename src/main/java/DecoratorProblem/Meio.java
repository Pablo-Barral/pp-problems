package DecoratorProblem;

public abstract class Meio extends NotificacaoDecorator {

    public Meio(Notificacao notificacao) {
        super(notificacao);
    }

    public abstract String getCustomizacaoNotificacao();

    public String getNomeEstrutura() {
        return "Meio de entrega";
    }
}
