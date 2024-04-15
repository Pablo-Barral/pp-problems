package DecoratorProblem;

public class LogoApp extends Informacoes{
    public LogoApp(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String getCustomizacaoNotificacao() {
        return " | Exibir logo do app";
    }
}
