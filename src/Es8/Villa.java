package Es8;

public class Villa extends Casa{

    private boolean piscina;

    public Villa(int stanze, double superficie, boolean piscina){
        super(stanze, superficie);
        this.piscina = piscina;
    }

    public double costo(){
        double c = getSuperficie() * 2000;
        if (piscina) {
            c += 20000;
        }

        if (getStanze() == 10) {
            c += 10000;
        }
        return c;
    }
}
