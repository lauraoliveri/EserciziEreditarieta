package Es6;

public class Auto implements Veicolo{
    @Override
    public void startEngine() {
        System.out.println("il motore dell'auto è acceso");
    }
}

//
//Creare un'interfaccia chiamata Veicolo con un metodo  startEngine.
//
//Creare una classe Auto che implementa l'interfaccia Veicolo e sovrascrive il metodo startEngine
//e stampa "il motore dell'auto è acceso"" +" +
//        ""Creare una seconda classe Moto che implementa l'interfaccia Veicolo e" +
//        " sovrascrive il metodo startEngine e stampa "il motore della moto è acceso