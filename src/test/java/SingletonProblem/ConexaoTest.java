package SingletonProblem;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConexaoTest {

    @Test
    public void tabelaBanco() {
        Conexao.getInstance().setTabelaBanco("Produtos");
        assertEquals("Produtos", Conexao.getInstance().getTabelaBanco());
    }

    @Test
    public void usuarioLogado() {
        Conexao.getInstance().setUsuarioLogado("José Teste");
        assertEquals("José Teste", Conexao.getInstance().getUsuarioLogado());
    }

    @Test
    public void testeSingleton() {
        Conexao x = new Conexao();
        x.setTabelaBanco("Usuários");
        x.setUsuarioLogado("José Teste");

        assertNotNull(Conexao.getInstance());

    }

    @Test
    public void destruir(){
        Conexao x = new Conexao();
        Conexao.getInstance().setUsuarioLogado("admin");
        assertNotNull(Conexao.getInstance());
        assertEquals("admin", Conexao.getInstance().getUsuarioLogado());
        Conexao.destroy();
        assertNull(Conexao.getInstance().getUsuarioLogado());
    }

}