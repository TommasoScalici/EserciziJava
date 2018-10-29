package ruoli;

public class Studente extends Persona {

    protected String matricola, universita;

    public Studente(String nome, String cognome, String matricola, String universita) {
        super(nome, cognome);
        this.matricola = matricola;
        this.universita = universita;
    }

    public Studente(String nome, String cognome, int eta, String matricola, String universita) {
        this(nome, cognome, matricola, universita);
        this.eta = eta;
    }

    @Override
    public void presentati() {
        super.presentati();
        System.out.println(", studio presso " + universita + " e la mia matricola è " + matricola);
    }

    @Override
    public String toString() {
        return super.toString() + "Università: " + universita +
               "\n" + "Matricola: " + matricola +
               "\n";
    }
}