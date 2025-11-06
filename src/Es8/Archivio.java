package Es8;

import java.util.ArrayList;

public class Archivio {

    ArrayList<Villa> Ville = new ArrayList<Villa>();

    ArrayList<Appartamento> Appartamenti = new ArrayList<Appartamento>();

    //costruttore
    public Archivio(ArrayList<Villa> ville, ArrayList<Appartamento> appartamenti) {
        Ville = ville;
        Appartamenti = appartamenti;
    }

    //restituisce la media dei costi di tutte le case presenti negli arraylist la cui superficie supera n
    public double mediaCosti(int n){

        double media = 0;
        int c = 0;

        for (Villa villa : Ville) {
            if (villa.getSuperficie() > n){
                media += villa.getSuperficie();
                c++;
            }
        }

        for (Appartamento appartamento : Appartamenti) {
            if (appartamento.getSuperficie() > n){
                media += appartamento.getSuperficie();
                c++;
            }
        }

        System.out.println(c);
        media = media / c;
        return media;
    }
}
