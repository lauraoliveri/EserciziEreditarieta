package Es2;

public class Tecnico extends Dipendente{

    @Override
    public int calcolaStipendio() {
        return super.calcolaStipendio() + 300;
    }
}
