package Es7;

abstract class Animale {

    private String nome;
    private int eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public abstract String emettiVerso();

    public void mostraDettagli(){
        System.out.println("Nome: " + nome + " - " + "Età: " + eta + " - " + "Verso: " + emettiVerso() );
    }
}
