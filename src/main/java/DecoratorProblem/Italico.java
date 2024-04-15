package DecoratorProblem;

public class Italico extends Formatacao{
    public Italico(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Mensagem formatada em itálico";
    }
}
