package biblioteca;

import java.util.*;

public final class Biblioteca {
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    private Biblioteca() {
    }


    public static void main(String[] args) {

        System.out.println("********** Menu Gestione Biblioteca **********\n\n");
        System.out.println(   "0) Esci dal programma\n"
                            + "1) Inserisci nuovo documento\n"
                            + "2) Modifica documento\n"
                            + "3) Elimina un documento\n"
                            + "4) Ricerca un documento\n");

        int scelta = -1;
        
        while (scelta != 0) {

            System.out.print("Fai una scelta: ");
            
            try {
                scelta = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                // Se il parse genera un'eccezione, non fare niente
            }

            scanner.nextLine();

            switch (scelta) {
                case 0:
                    return;
                case 1:
                    // Aggiungi documento
                    break;
                case 2:
                    // Modifica documento
                    break;
                case 3:
                    // Elimina documento
                    break;
                case 4:
                    // Ricerca documento
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }
}
