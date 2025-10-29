package Es3;

public class Rettangolo extends FiguraGeometrica{


    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    double calcolaArea() {
        return getBase() * getAltezza();
    }
}
