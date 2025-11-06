package Es9;

public class Furgone extends Veicolo{

    private double capacita;

    public Furgone(String marca, int anno, int cilindrata, double capacita) {
        super(marca, anno, cilindrata);
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return super.toString() + "Furgone{" +
                "capacita=" + capacita +
                '}';
    }
}
