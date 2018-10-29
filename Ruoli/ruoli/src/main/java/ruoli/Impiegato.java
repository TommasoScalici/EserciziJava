package ruoli;

public class Impiegato extends Persona {

    protected String datoreLavoro;
    protected double salario;
    

    public Impiegato(String nome, String cognome, String datoreLavoro, double salario) {
        super(nome, cognome);
        this.datoreLavoro = datoreLavoro;
        this.salario = salario;
    }

    public Impiegato(String nome, String cognome, int eta, String datoreLavoro, double salario) {
        this(nome, cognome, datoreLavoro, salario);
        this.eta = eta;
    }


    @Override
    public void presentati() {
        super.presentati();
        System.out.print(", lavoro presso " + datoreLavoro + " e il mio salario è di " + salario + " euro/mese");
    }

    @Override
    public String toString() {
        return super.toString() + "Datore di lavoro: " + datoreLavoro +
               "\n" + "Salario: " + salario +
               "\n";
    }
}