package SingletonProblem;

public class Conexao {

    Conexao() {}

    ;
    private static Conexao instance;

    public static Conexao getInstance() {
        if (instance == null){
            instance = new Conexao();
        }

        return instance;
    }


    public static void destroy(){
        instance = null;
    }

    private String tabelaBanco;
    private String usuarioLogado;

    public String getTabelaBanco() {
        return tabelaBanco;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setTabelaBanco(String tabelaBanco){
        this.tabelaBanco = tabelaBanco;
    }

    public void setUsuarioLogado(String usuarioLogado){
        this.usuarioLogado = usuarioLogado;
    }
}