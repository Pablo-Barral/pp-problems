package FlyweightProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UnidadeFactory {
    private static Map<String, Unidade> unidades = new HashMap<>();

    public static Unidade getUnidades(String classe) {
        Unidade unidade = unidades.get(classe);
        if (unidade == null) {
            if (Objects.equals(classe, "Suporte")){
                unidade = new Suporte();
            }else if (Objects.equals(classe, "Tanque")){
                unidade = new Tanque();
            }else if (Objects.equals(classe, "Dano")){
                unidade = new Dano();
            }
            unidades.put(classe, unidade);
        }
        return unidade;
    }

    public static int getTotalUnidades(){
        return unidades.size();
    }
}




