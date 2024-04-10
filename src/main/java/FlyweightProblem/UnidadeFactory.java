package FlyweightProblem;

import java.util.HashMap;
import java.util.Map;

public class UnidadeFactory {
    private static Map<String, Unidade> unidades = new HashMap<>();

    public static Unidade getUnidades(String tipo, String textura, String modelo3D) {
        Unidade unidade = unidades.get(tipo);
        if (unidade == null) {
            unidade = new Unidade(tipo, textura, modelo3D);
            unidades.put(tipo, unidade);
        }
        return unidade;
    }

    public static int getTotalUnidades(){
        return unidades.size();
    }
}




