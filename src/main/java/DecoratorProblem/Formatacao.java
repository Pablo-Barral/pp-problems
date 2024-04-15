package DecoratorProblem;

public abstract class Formatacao extends NotificacaoDecorator {

    public Formatacao(Notificacao notificacao) {
        super(notificacao);
    }

    public abstract String getCustomizacaoNotificacao();

    public String getNomeEstrutura() {
        return "Formatação Especial";
    }
}
