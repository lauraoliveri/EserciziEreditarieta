package Es9;

public class Main {
    public static void main(String[] args) {

        Auto a = new Auto("Audi", 2000, 23,4, "Benzina");
        Moto m =  new Moto("Yamaya", 2004, 34,23.4);
        Furgone f = new Furgone("Mercedes", 2002, 3,30.5);
        Moto m2 = new Moto("Fiat", 2005, 24,22.4);

        Garage g = new Garage();
        g.immissioneVeicolo(a, 0);
        g.immissioneVeicolo(m, 1);
        g.immissioneVeicolo(f,2);
        g.immissioneVeicolo(m2, 3);

        System.out.println(g);

        g.estrazioneVeicolo(m,1);

        System.out.println(g);
    }
}
