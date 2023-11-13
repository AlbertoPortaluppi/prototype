package prototype;

public class Eletronico extends Produto {
    private String fabricante;

    public Eletronico(String name, String fabricante) {
        super(name);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}