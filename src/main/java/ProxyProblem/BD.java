package ProxyProblem;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Detento> detentos = new HashMap<>();

    public static Detento getDetento(Integer codigo) {
        return detentos.get(codigo);
    }

    public static void addDetento(Detento detento) {
        detentos.put(detento.getCodigo(), detento);
    }
}
