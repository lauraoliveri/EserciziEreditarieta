package Es7;

public class Leone extends Animale{
    public Leone(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public String emettiVerso() {
        return "ruggito";
    }

}
