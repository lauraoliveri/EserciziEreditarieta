package Es3;

abstract class FiguraGeometrica {

    private double base;
    private double altezza;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public FiguraGeometrica(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    abstract double calcolaArea();

}

//. Creare una classe FiguraGeometrica con i campi:
//
//base
//        altezza
//metodo astratto calcolaArea
//
//Creare una classe Triangolo  che estende FiguraGeometrica
//e fa l'override del metodo calcolaArea, tenendo conto che l'area è uguale a base*altezza/2
//
//
//
//Creare una classe Rettangolo che estende FiguraGeometrica e
//fa l'override del metodo calcolaArea, tenendo conto che l'area è uguale a base*altezza