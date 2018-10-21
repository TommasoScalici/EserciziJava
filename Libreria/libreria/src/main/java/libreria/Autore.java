package libreria;

public class Autore {

    private String nome, cognome;
    
    
    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    
    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}