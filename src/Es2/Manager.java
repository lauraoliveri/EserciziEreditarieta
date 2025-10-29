package Es2;

public class Manager extends Dipendente{

    @Override
    public int calcolaStipendio() {
        return super.calcolaStipendio() + 500;
    }
}
