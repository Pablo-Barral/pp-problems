package DecoratorProblem;

public class Email extends Meio{
    public Email(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Mensagem enviada via e-mail";
    }
}