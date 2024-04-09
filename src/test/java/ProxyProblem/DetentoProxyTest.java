package ProxyProblem;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DetentoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addDetento(new Detento(1, "João", "A1", 11.0f));
        BD.addDetento(new Detento(2, "José", "A2", 7.0f));
    }

    @Test
    void dadosDetento() {
        DetentoProxy detento = new DetentoProxy(1);

        assertEquals(Arrays.asList("João", "A1"), detento.obterDados());
    }

    @Test
    void penaDetento() {
        Guarda guarda = new Guarda("Carlos", true);
        DetentoProxy detento = new DetentoProxy(2);

        assertEquals(7.0f, detento.obterPena(guarda));
    }

    @Test
    void guardaNaoAutorizado() {
        try {
            Guarda guarda = new Guarda("Arthur", false);
            DetentoProxy detento = new DetentoProxy(2);

            detento.obterPena(guarda);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Guarda não autorizado", e.getMessage());
        }
    }
}