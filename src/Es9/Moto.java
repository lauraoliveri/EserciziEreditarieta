package Es9;

public class Moto extends Veicolo{

    private double tempi;

    public Moto(String marca, int anno, int cilindrata, double tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" +
                "tempi=" + tempi +
                '}';
    }
}
