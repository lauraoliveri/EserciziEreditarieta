package Es9;

public class Auto extends Veicolo{

    private int porte;
    private String alimentazione;


    public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }


    @Override
    public String toString() {
        return super.toString() + "Auto{" +
                "porte=" + porte +
                ", alimentazione='" + alimentazione + '\'' +
                '}';
    }
}
