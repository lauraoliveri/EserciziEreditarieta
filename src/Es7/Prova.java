package Es7;

import java.util.ArrayList;

public class Prova {
    public static void main(String[] args) {


        ArrayList<Animale> animali = new ArrayList<Animale>();

        Leone l = new Leone("luca", 5);
        Pinguino p = new Pinguino("pio", 2);
        Acquila a = new Acquila("anna", 2);
        animali.add(l);
        animali.add(p);
        animali.add(a);

        // mostra i dettagli di ogni animale nella lista

        for (Animale animale : animali) {
            animale.mostraDettagli();

            if (animale instanceof Pinguino) { // e se è un pinguino esegue il metodo nuota
                ((Pinguino) animale).nuota();
            }
            if (animale instanceof Acquila) {  // se un' acquila il metodo vola
                ((Acquila) animale).vola();
            }
        }
    }
}
