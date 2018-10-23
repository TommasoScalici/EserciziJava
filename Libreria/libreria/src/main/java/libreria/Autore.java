package libreria;

public class Autore {

    private String nome, cognome;
    
    
    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }


    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    

    @Override
    public String toString() {
        return nome + " " + cognome;
    }

    @Override
    public boolean equals(Object obj) {
        Autore a = (Autore)obj;

        if(a == null) return false;
        if(!this.nome.equals(a.nome)) return false;
        if(!this.cognome.equals(a.cognome)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}