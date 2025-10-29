package Es1;

public class Docente extends Persona{
    private int salario;

    public Docente(String nome, String cognome, int salario) {
        super(nome, cognome);
        this.salario = salario;
    }
}
