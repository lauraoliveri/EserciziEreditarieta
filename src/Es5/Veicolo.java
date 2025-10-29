package Es5;

abstract class Veicolo {

    private double velocita;
    private double accelerazione;

    public Veicolo(double velocita, double accelerazione) {
        this.velocita = velocita;
        this.accelerazione = accelerazione;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public double getAccelerazione() {
        return accelerazione;
    }

    public void setAccelerazione(double accelerazione) {
        this.accelerazione = accelerazione;
    }

    // prende in input un oggetto di classe VEICOLO e ne stampa la velocità
    public void printVelocita(Veicolo v){
        System.out.println(getVelocita());
    }
    // stampa il numero di ruote del veicolo, METODO ASTRATTO
    public abstract void printNRuote();
}
