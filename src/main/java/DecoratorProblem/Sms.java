package DecoratorProblem;

public class Sms extends Meio{
    public Sms(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Mensagem enviada via SMS";
    }
}
