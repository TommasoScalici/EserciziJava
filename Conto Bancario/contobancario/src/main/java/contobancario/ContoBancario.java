package contobancario;


public class ContoBancario {

    private static int progressivo;
    private String numeroConto, nome, cognome;
    private double saldo;


    public ContoBancario(String nome, String cognome) {
        numeroConto = String.valueOf(++progressivo);
        this.nome = nome;
        this.cognome = cognome;
    }

    public void preleva(double importo) {
        saldo -= importo;
    }

    public void travasa(double importo, ContoBancario beneficiario) {
        preleva(importo);
        beneficiario.versa(importo);
    }

    public void versa(double importo) {
        saldo += importo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    @Override
    public String toString() {
        return "# " + numeroConto + "\n" + nome + " " + cognome + "\n" + "Saldo: " + String.format("%.2f euro", saldo);
    }
}