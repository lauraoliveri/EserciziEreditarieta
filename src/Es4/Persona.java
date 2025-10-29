package Es4;

abstract class Persona {

    protected String nome;
    protected int annoDiNascita;

    public Persona(String nome, int annoDiNascita) {
        this.nome = nome;
        this.annoDiNascita = annoDiNascita;
    }

    public abstract void whoAmI();
}

//na classe astratta Persona definisce una generica persona (con attributo nome per il nome,
//                                                           ed anno per l’anno di nascita ) e il metodo astratto:
//
//public abstract String whoAmI();
//
//Si definisca la sottoclasse Studente che deriva da Persona e che aggiunge un attributo
//intero matricola per indicare la matricola dello studente. Nella sottoclasse Studente,
//si definisca il metodo whoAmI()in modo da restituire la concatenazione del nome, dell’anno
//di nascita e della matricola come stringa.
//
//
//
//Si realizzi un metodo main in una classe Prova che crei due oggetti anna e mario istanza
//        di Studente, il primo oggetto con  attributi “Anna”, 1997, 12345 e il secondo oggetto
//con attributi “Mario”, 1997, 13344.
//
//
//
//Chiamare il metodo whoAmI() sui due oggetti  anna e mario