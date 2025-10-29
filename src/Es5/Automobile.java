package Es5;

public class Automobile extends Veicolo{

    private String targa;
    private boolean avviata;

    public Automobile(double velocita, double accelerazione, String targa, boolean avviata) {
        super(velocita, accelerazione);
        this.targa = targa;
        this.avviata = avviata;
    }

    // "accende" e "spegne" la macchina, agendo sul boolean avviata
    public void avvia() {
        avviata = true;
    }
    public void spegni() {
        avviata = false;
    }
    // accelera controlla se la macchina è avviata, nel qual caso setta i
// nuovi valori di accelerazione e velocità (vel. Precedente + acc*sec)
    public void accelera(double accelerazione, int secondi) {
        if (avviata){
            setAccelerazione(accelerazione);
            setVelocita(getVelocita() + accelerazione*secondi);

        }
    }
    // stampa il numero di ruote del veicolo cioè 4
    public void printNRuote() {
        System.out.println("Numero di ruote: 4");
    }
}
