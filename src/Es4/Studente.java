package Es4;

public class Studente extends Persona{

    private int matricola;

    public Studente(String nome, int annoDiNascita, int matricola) {
        super(nome, annoDiNascita);
        this.matricola = matricola;
    }


    @Override
    public void whoAmI() {
        System.out.println("Nome: " + nome + " - Anno di nascita: " + annoDiNascita + " - Matricola: " + matricola);
    }
}
