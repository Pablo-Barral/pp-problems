package DecoratorProblem;

public class NotificacaoSimples implements Notificacao {

    public String mensagem;

    public NotificacaoSimples() {
    }

    public NotificacaoSimples(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getEstrutura() {
        return "Notificação";
    }

}
