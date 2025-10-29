package Es5;

public class VeicoloMain {
    public static void main(String[] args) {

        Automobile a = new Automobile(1.1,5.1, "AJHBDIB83", true);
        Bicicletta b = new Bicicletta(1.3,0.5);

        a.accelera(2.3, 2);
        b.pedala(0.3, 0.6);

        a.printVelocita(a);
        b.printVelocita(b);
        a.printNRuote();
        b.printNRuote();
//        Creare una classe VeicoloMain contenente il metodo
//        main.
//• Nel metodo main definire un oggetto a istanza di
//        Automobile e un oggetto b istanza di Bicicletta.
//• Richiamare i metodi pedala e accelera
//        rispettivamente per b e a.
//• Stampare la velocità dei due veicoli e il loro numero di
//        ruote, usando i metodi printVelocita(Veicolo v)
//        e printNRuote().
    }
}
