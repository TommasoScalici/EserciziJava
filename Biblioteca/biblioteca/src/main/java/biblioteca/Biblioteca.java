package biblioteca;

import java.util.*;

public final class Biblioteca {
    
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Documento> documenti = new ArrayList<>();

    
    private Biblioteca() {
    }


    public static void main(String[] args) {

        System.out.println("********** Menu Gestione Biblioteca **********\n\n");
        System.out.println(   "0) Esci dal programma\n"
                            + "1) Inserisci nuovo documento\n"
                            + "2) Modifica documento\n"
                            + "3) Elimina un documento\n"
                            + "4) Ricerca un documento\n"
                            + "5) Visualizza tutti i documenti in biblioteca\n");

        int scelta = -1;
        
        while (scelta != 0) {

            System.out.print("\nFai una scelta: ");
            
            try {
                scelta = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                // Se il parse genera un'eccezione, non fare niente
            }

            scanner.nextLine();
            System.out.println();

            switch (scelta) {
                case 0:
                    return;
                case 1:
                    aggiungiDocumento();
                    break;
                case 2:
                    modificaDocumento();
                    break;
                case 3:
                    eliminaDocumento();
                    break;
                case 4:
                    ricercaDocumento();
                    break;
                case 5:
                    for (Documento documento : documenti) 
                        System.out.println(documento + "\n");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }


    private static void aggiungiDocumento() {
        String titolo = "", casaEditrice = "", lingua = "", nome, cognome;
        double prezzo = 0d;
        ArrayList<Autore> autori = new ArrayList<>();

        int scelta = 0;
        System.out.println("Cosa vuoi inserire?\n1)Libro\n2)Dizionario\n");
        System.out.print("Scegli: ");

        try {
            scelta = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            // Se il parse genera un'eccezione, non fare niente
        }

        scanner.nextLine();

        switch (scelta) {
            case 2:
                System.out.print("Inserisci lingua: ");
                lingua = scanner.nextLine();
            case 1:
                System.out.print("Inserisci titolo: ");
                titolo = scanner.nextLine();
                System.out.print("Inserisci casa editrice: ");
                casaEditrice = scanner.nextLine();
                System.out.print("Inserisci prezzo: ");
                prezzo = scanner.nextDouble();

                boolean inserimentoAutore = true;

                while(inserimentoAutore) {
                    System.out.print("Inserire autore? (Y/N): ");
                    char c = scanner.next().toUpperCase().charAt(0);
                    scanner.nextLine();
                    
                    if(c == 'Y') {
                        System.out.print("Inserisci nome autore: ");
                        nome = scanner.nextLine();
                        System.out.print("Inserisci cognome autore: ");
                        cognome = scanner.nextLine();
                        autori.add(new Autore(nome, cognome));
                    }

                    else if(c == 'N')
                        inserimentoAutore = false;
                    else
                        System.out.println("Scelta non valida.");
                }
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }

        if(scelta == 1)
            documenti.add(new Libro(titolo, prezzo, casaEditrice, autori));
        if(scelta == 2)
            documenti.add(new Dizionario(titolo, prezzo, casaEditrice, lingua, autori));
    }

    private static void eliminaDocumento() {
    }

    private static void modificaDocumento() {
    }

    private static void ricercaDocumento() {
    }
}
