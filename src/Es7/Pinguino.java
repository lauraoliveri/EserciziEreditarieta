package Es7;

public class Pinguino extends Animale{
    public Pinguino(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public String emettiVerso() {
        return "pigolio";
    }

    public void nuota(){
        System.out.println("il pinguino sta nuotando");
    }

}
