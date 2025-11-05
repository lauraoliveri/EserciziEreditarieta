package Es7;

public class Acquila extends Animale{

    public Acquila(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public String emettiVerso() {
        return "strido";
    }

    public void vola(){
        System.out.println("l'acquila sta volando");
    }
}
