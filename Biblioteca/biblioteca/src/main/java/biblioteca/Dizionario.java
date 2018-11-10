package biblioteca;

import java.util.*;

public final class Dizionario extends Libro {
    
    String lingua;


    public Dizionario(String titolo, double prezzo, String casaEditrice, String lingua) {
        super(titolo, prezzo, casaEditrice);
        this.lingua = lingua;
    }


    public Dizionario(String titolo, double prezzo, String casaEditrice, String lingua, ArrayList<Autore> autori) {
        super(titolo, prezzo, casaEditrice, autori);
        this.lingua = lingua;
    }


    public String getLingua() { return lingua; }


    @Override
    public String toString() {
        return super.toString() + "\n" + "Lingua dizionario: " + lingua;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Dizionario))
            return false;

        Dizionario d = (Dizionario)obj;

        if(!super.equals(obj)) return false;
        if(!this.lingua.equals(d.lingua)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}