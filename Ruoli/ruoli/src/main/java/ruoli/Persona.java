package ruoli;

public class Persona {

    protected String nome, cognome;
    protected int eta;


    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, int eta) {
        this(nome, cognome);
        this.eta = eta;
    }


    public void presentati() {
        System.out.print("Mi chiamo " + nome + " " + cognome + " e ho " + eta + " anni");
    }


    @Override
    public String toString() {
        return "\n" + "Nome: " + nome +
               "\n" + "Cognome: " + cognome +
               "\n" + "Età: " + eta +
               "\n";
    }
}