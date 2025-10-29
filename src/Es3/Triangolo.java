package Es3;

public class Triangolo extends FiguraGeometrica{


    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    double calcolaArea() {
        return getBase() * getAltezza() / 2.0;
    }
}
