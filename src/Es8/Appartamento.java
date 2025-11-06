package Es8;

public class Appartamento extends Casa{

    private int codiceEnergetico;

    public int getCodiceEnergetico() {
        return codiceEnergetico;
    }

    public void setCodiceEnergetico(int codiceEnergetico) {
        this.codiceEnergetico = codiceEnergetico;
    }

    public Appartamento(int stanze, double superficie, int codiceE) {
        super(stanze, superficie);
        codiceEnergetico = codiceE;
    }

    public double costo(){

        return getSuperficie() * 1500 + getStanze() * getCodiceEnergetico();
    }

    //Per gli appartamenti il costo è il prodotto
    // fra la superficie e 1500, più il prodotto
    // fra il numero delle stanze ed il codice energetico.
}
