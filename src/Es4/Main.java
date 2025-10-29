package Es4;

public class Main {
    public static void main(String[] args) {

        Studente s1 = new Studente("Anna", 1997, 12345);
        Studente s2 = new Studente("Giuseppe", 1998, 12345);

        s1.whoAmI();
        s2.whoAmI();
    }
}
