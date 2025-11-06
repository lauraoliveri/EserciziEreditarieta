package Es8;

public abstract class Casa {

    private int stanze;
    private double superficie;

    public Casa(int stanze, double superficie) {
        this.stanze = stanze;
        this.superficie = superficie;
    }


    public abstract double costo();

    public int getStanze() {
        return stanze;
    }

    public void setStanze(int stanze) {
        this.stanze = stanze;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }


}
