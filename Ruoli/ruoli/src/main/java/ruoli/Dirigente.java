package ruoli;

public final class Dirigente extends Impiegato {

    private String dipartimento;


    public Dirigente(String nome, String cognome, int eta, String datoreLavoro, double salario, String dipartimento) {
        super(nome, cognome, eta, datoreLavoro, salario);

        this.dipartimento = dipartimento;
    }


    @Override
    public void presentati() {
        super.presentati();
        System.out.println(". Lavoro presso il dipartimento di " + dipartimento);
    }

    @Override
    public String toString() {
        return super.toString() + "Dipartimento: " + dipartimento + "\n";
    }
}