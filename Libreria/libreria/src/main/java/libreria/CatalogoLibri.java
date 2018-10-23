package libreria;

import java.util.*;

public final class CatalogoLibri {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Libro> libri = new ArrayList<>();

    private CatalogoLibri() { }

    public static void main(String[] args) {

        System.out.println("---------- Libreria Online 1.0 ----------\n\n");

        System.out.println("1. Inserisci un nuovo libro\n"
                        +  "2. Stampa il catalogo libri\n"
                        +  "3. Cerca un libro nel catalogo\n"
                        +  "4. Esci dal programma\n\n");

        int scelta = 0;

        while (true) {
            
            System.out.print("Fai una scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:

                Libro l = inserisciLibro();
                if(libri.contains(l))
                    System.out.println("Il libro è già in archivio");
                else
                    libri.add(l);

                    break;
                case 2:
                System.out.println("\n---------- Stampa del catalogo libri ----------\n\n");
                for (Libro libro : libri)
                    System.out.println(libro);
                System.out.println("\n----------         Fine stampa       ----------\n\n");
                    break;
                case 3:
                System.out.println("Inserisci testo da ricercare: ");
                String testoRicerca = scanner.nextLine();
                ricercaLibro(testoRicerca);
                    break;
                case 4:
                scanner.close();
                    return;
                default:
                System.out.println("Comando non valido.\n");
                    break;
            }
        }   
    }

    private static Libro inserisciLibro() {
        String titolo, casaEditrice, nome, cognome;
        int numeroAutori;
        double prezzo;
        Autore[] autori;

        System.out.print("Inserisci titolo del libro: ");
        titolo = scanner.nextLine();
        System.out.print("Inserisci prezzo del libro: ");
        prezzo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Inserisci casa editrice del libro: ");
        casaEditrice = scanner.nextLine();
        System.out.print("Inserisci il numero di autori da inserire: ");
        numeroAutori = scanner.nextInt();
        scanner.nextLine();

        autori = new Autore[numeroAutori];

        for(int i = 0; i < numeroAutori; i++)
        {
            System.out.print("Inserisci nome autore: ");
            nome = scanner.nextLine();
            System.out.print("Inserisci cognome autore: ");
            cognome = scanner.nextLine();
            autori[i] = new Autore(nome, cognome);
        }

        return new Libro(titolo, prezzo, casaEditrice, autori);
    }

    private static void ricercaLibro(String testoRicerca) {

        String[] stringhe = testoRicerca.toUpperCase().split(" ");

        for (String stringa : stringhe) {
            for (Libro libro : libri) {

                if(libro.getCasaEditrice().toUpperCase().contains(stringa) ||
                   libro.getTitolo().toUpperCase().contains(stringa)) {
                   System.out.print(libro);
                   continue;
                }

                for (Autore autore : libro.getAutori()) {
                    if(autore.getCognome().toUpperCase().contains(stringa) ||
                       autore.getNome().toUpperCase().contains(stringa)) {
                           System.out.print(libro);
                           continue;
                    }
                }
            }
        }
    }
}
