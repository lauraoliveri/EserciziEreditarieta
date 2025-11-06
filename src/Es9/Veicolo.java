package Es9;

public abstract class Veicolo {

    private String marca;
    private int anno;
    private int cilindrata;

    public Veicolo(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", anno=" + anno +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
