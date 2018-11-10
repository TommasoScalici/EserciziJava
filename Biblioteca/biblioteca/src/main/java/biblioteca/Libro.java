package biblioteca;

import java.util.*;

public class Libro extends Documento {

    private double prezzo;
    private String casaEditrice, titolo;
    private ArrayList<Autore> autori = new ArrayList<>();


    public Libro(String titolo, double prezzo, String casaEditrice) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.casaEditrice = casaEditrice;
    }
    
    public Libro(String titolo, double prezzo, String casaEditrice, ArrayList<Autore> autori) {
        this(titolo, prezzo, casaEditrice);
        this.autori = autori;
    }


    public ArrayList<Autore> getAutori() { return autori; }
    public String getCasaEditrice() { return casaEditrice; }
    public double getPrezzo() { return prezzo; }
    public String getTitolo() { return titolo; }


    @Override
    public String toString() {
        return super.toString() + "\n" + "Titolo: " + titolo + "\n" + "Prezzo: " + String.format("%.2f EUR", prezzo) 
               + "\n" + "Casa editrice: " + casaEditrice + "\n" + "Autori: " + autori;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Libro))
            return false;

        Libro l = (Libro)obj;

        if(!super.equals(obj)) return false;
        if(!this.autori.equals(l.autori)) return false;
        if(!this.casaEditrice.equals(l.casaEditrice)) return false;
        if(!this.titolo.equals(l.titolo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}