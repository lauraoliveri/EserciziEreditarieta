package Es1;

public class Persona {

    private String nome;
    private String cognome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}

//1. Creare una classe Persona con i seguenti attributi:
//
//nome
//
//        cognome
//
//Creare una classe Docente che estende Persona e aggiunge i seguenti
//
//        salario
//
//Creare una classe Studente che estende Persona e aggiunge i seguenti attributi:
//
//matricola