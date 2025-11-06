package Es8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // creo le ville
        Villa v1 = new Villa(4, 180.5, true);  // più di 150
        Villa v2 = new Villa(6, 250.0, true);   // più di 150
        Villa v3 = new Villa(3, 120.0, false);
        Villa v4 = new Villa(8, 320.75, true);  // più di 150
        Villa v5 = new Villa(5, 130.0, false);


        ArrayList<Villa> ville = new ArrayList<Villa>();
        ville.add(v1);
        ville.add(v2);
        ville.add(v3);
        ville.add(v4);
        ville.add(v5);

        // creo gli appartamenti
        Appartamento a1 = new Appartamento(2, 70.0, 3);
        Appartamento a2 = new Appartamento(6, 155.5, 1);// più di 150
        Appartamento a3 = new Appartamento(4, 95.0, 2);
        Appartamento a4 = new Appartamento(7, 160.0, 4); // più di 150
        Appartamento a5 = new Appartamento(3, 80.0, 5);



        ArrayList<Appartamento> appart = new ArrayList<Appartamento>();
        appart.add(a1);
        appart.add(a2);
        appart.add(a3);
        appart.add(a4);
        appart.add(a5);

        Archivio a = new Archivio(ville, appart);
        double media = a.mediaCosti(150);
        System.out.println(media);
    }
}
