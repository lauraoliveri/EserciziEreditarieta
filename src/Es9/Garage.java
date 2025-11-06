package Es9;

import java.util.Arrays;

public class Garage {

    Veicolo[] garage = new Veicolo[15];


    public void immissioneVeicolo(Veicolo v, int pos){
        if (v instanceof Auto || v instanceof Moto || v instanceof Furgone){
            if (pos >= 0 && pos < garage.length){
                garage[pos] = v;
            }else {
                System.out.println("Posto non valido");
            }
        }
    }

    public Veicolo estrazioneVeicolo(Veicolo v, int posizione){
        Veicolo vEliminato = garage[posizione];
        garage[posizione] = null;
        System.out.println("Posto liberato");
        return  vEliminato;


    }

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + Arrays.toString(garage) +
                '}';
    }



}
