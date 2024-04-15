package DecoratorProblem;

public class Negrito extends Formatacao{
    public Negrito(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Mensagem formatada em negrito";
    }
}
