package DecoratorProblem;

public class DataHora extends Informacoes{
    public DataHora(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Exibir data e hora de envio";
    }
}