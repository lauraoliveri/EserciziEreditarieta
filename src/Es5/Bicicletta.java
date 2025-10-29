package Es5;

public class Bicicletta extends Veicolo{

    public Bicicletta(double velocita, double accelerazione) {
        super(0, 0);
    }

    // pedala caso setta i nuovi valori di nel seguente modo:
// - accelerazione (num. Pedalate / sec ^2)
// - velocità (vel. Precedente + acc*sec)
    public void pedala(double numeroPedalate, double secondi) {
        setAccelerazione( numeroPedalate / Math.pow(secondi, 2));
        setVelocita(getVelocita() + getAccelerazione() * secondi);
    }
    // stampa il numero di ruote del veicolo => 2
    public void printNRuote(){
        System.out.println("Numero di ruote: 2");
    }
}
