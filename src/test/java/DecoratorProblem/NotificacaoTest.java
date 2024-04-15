package DecoratorProblem;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificacaoTest {

    @Test
    void notificacaoSimples() {
        Notificacao notificacao = new NotificacaoSimples("Teste");

        assertEquals("Teste", notificacao.getMensagem());
    }

    @Test
    void notificacaoEmail() {
        Notificacao notificacao = new Email(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Mensagem enviada via e-mail", notificacao.getMensagem());
    }

    @Test
    void notificacaoSms() {
        Notificacao notificacao = new Sms(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Mensagem enviada via SMS", notificacao.getMensagem());
    }

    @Test
    void notificacaoComLogo() {
        Notificacao notificacao = new LogoApp(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Exibir logo do app", notificacao.getMensagem());
    }

    @Test
    void notificacaoComDataHora() {
        Notificacao notificacao = new DataHora(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Exibir data e hora de envio", notificacao.getMensagem());
    }

    @Test
    void notificacaoNegrito() {
        Notificacao notificacao = new Negrito(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Mensagem formatada em negrito", notificacao.getMensagem());
    }

    @Test
    void notificacaoItalico() {
        Notificacao notificacao = new Italico(new NotificacaoSimples("Teste"));

        assertEquals("Teste | Mensagem formatada em itálico", notificacao.getMensagem());
    }


    @Test
    void notificacaoCompleta1() {
        Notificacao notificacao = new Sms(new Negrito(new LogoApp(new NotificacaoSimples("Teste"))));

        assertEquals("Teste | Exibir logo do app | Mensagem formatada em negrito | Mensagem enviada via SMS", notificacao.getMensagem());
    }

    @Test
    void notificacaoCompleta2() {
        Notificacao notificacao = new Email(new Italico(new DataHora(new NotificacaoSimples("Teste"))));

        assertEquals("Teste | Exibir data e hora de envio | Mensagem formatada em itálico | Mensagem enviada via e-mail", notificacao.getMensagem());
    }

    @Test
    void estruturaCompleta() {
        Notificacao notificacao = new Email(new DataHora(new Negrito(new NotificacaoSimples())));
        assertEquals("Notificação/Formatação Especial/Informacoes Adicionais/Meio de entrega", notificacao.getEstrutura());
    }

}