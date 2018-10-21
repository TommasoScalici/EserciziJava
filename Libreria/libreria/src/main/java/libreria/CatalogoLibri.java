package libreria;

import java.util.*;

public final class CatalogoLibri {

    private static final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Libro> libri = new ArrayList<>();

    private CatalogoLibri() { }

    public static void main(String[] args) {

        CatalogoLibri catalogo = new CatalogoLibri();

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
                catalogo.libri.add(catalogo.inserisciLibro());
                    break;
                case 2:
                System.out.println("\n---------- Stampa del catalogo libri ----------\n\n");
                for (Libro libro : catalogo.libri)
                    System.out.println(libro);
                System.out.println("\n----------         Fine stampa       ----------\n\n");
                    break;
                case 3:
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

    private Libro inserisciLibro() {
        char confirmChar = 'Y';
        String titolo, casaEditrice, nome, cognome;
        double prezzo;
        ArrayList<Autore> autori = new ArrayList<>();

        System.out.print("Inserisci titolo del libro: ");
        titolo = scanner.nextLine();
        System.out.print("Inserisci prezzo del libro: ");
        prezzo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Inserisci casa editrice del libro: ");
        casaEditrice = scanner.nextLine();

        System.out.print("\n--- Inserimento autori del libro ---\n");

        do {
            System.out.print("Inserisci nome autore: ");
            nome = scanner.nextLine();
            System.out.print("Inserisci cognome autore: ");
            cognome = scanner.nextLine();
            autori.add(new Autore(nome, cognome));

            System.out.print("Inserire un altro autore? (Y/N): ");
            confirmChar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

        } while (confirmChar == 'Y');

        return new Libro(titolo, prezzo, casaEditrice, autori.toArray(new Autore[0]));
    }
}
