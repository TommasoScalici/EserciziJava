package libreria;

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
    

    @Override
    public String toString() {
        return "ID:" + id + "\n" + "Titolo: " + titolo + "\n" + "Prezzo: " + String.format("%.2f EUR", prezzo) 
               + "\n" + "Casa editrice: " + casaEditrice + "\n" + "Autori: " + Utility.arrayToString(autori) + "\n";
    }
}