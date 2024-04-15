package DecoratorProblem;

public abstract class NotificacaoDecorator implements Notificacao {

    private Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public abstract String getCustomizacaoNotificacao();

    public String getMensagem() {
        return this.notificacao.getMensagem() + getCustomizacaoNotificacao();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.notificacao.getEstrutura() + "/" + this.getNomeEstrutura();
    }

}


