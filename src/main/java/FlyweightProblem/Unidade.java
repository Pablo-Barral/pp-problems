package FlyweightProblem;

public class Unidade {

    private String tipo;
    private String textura;
    private String modelo3D;

    public Unidade(String tipo, String textura, String modelo3D) {
        this.tipo = tipo;
        this.textura = textura;
        this.modelo3D = modelo3D;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTextura() {
        return textura;
    }

    public String getModelo3D(){return modelo3D;}
}
