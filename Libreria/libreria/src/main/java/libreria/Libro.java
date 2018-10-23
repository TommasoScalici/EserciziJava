package libreria;

import java.util.*;

public class Libro {

    private static int progressivo;
    private int id;
    private double prezzo;
    private String casaEditrice, titolo;
    private Autore[] autori;


    public Libro(String titolo, double prezzo, String casaEditrice, Autore[] autori) {
        id = ++progressivo;
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.casaEditrice = casaEditrice;
        this.autori = autori;
    }
    

    public Autore[] getAutori() { return autori; }
    public String getCasaEditrice() { return casaEditrice; }
    public double getPrezzo() { return prezzo; }
    public String getTitolo() { return titolo; }


    @Override
    public String toString() {
        return "ID:" + id + "\n" + "Titolo: " + titolo + "\n" + "Prezzo: " + String.format("%.2f EUR", prezzo) 
               + "\n" + "Casa editrice: " + casaEditrice + "\n" + "Autori: " + Utility.arrayToString(autori) + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Libro l = (Libro)obj;

        if(l == null) return false;
        if(!Arrays.equals(this.autori, l.autori)) return false;
        if(!this.casaEditrice.equals(l.casaEditrice)) return false;
        if(!this.titolo.equals(l.titolo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}