package contobancario;

import java.util.*;


public final class App {

    private static Scanner scanner = new Scanner(System.in);

    private App() {
    }

    public static void main(String[] args) {

        App app = new App();
        ArrayList<ContoBancario> conti = new ArrayList<>();

        System.out.println("---------- Gestione Conti Bancari 1.0 ----------\n\n");

        System.out.println("1. Inserisci nuovo conto bancario\n"
                        +  "2. Effettua un versamento su un conto\n"
                        +  "3. Effettua un prelievo da un conto\n"
                        +  "4. Travasa importo da un conto all'altro\n"
                        +  "5. Visualizza tutti i conti e relativi saldi\n"
                        +  "6. Esci dal programma\n\n");

        int scelta = 0;

        while (scelta != 6) {
            
            System.out.print("Fai una scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    conti.add(app.nuovoConto());
                    break;
                case 2:
                    app.effettuaVersamento(conti);
                    break;
                case 3:
                    app.effettuaPrelievo(conti);
                    break;
                case 4:
                    app.effettuaTravaso(conti);
                    break;
                case 5:
                    System.out.println("\n---------- Stampa dei conti memorizzati ----------\n\n");
                    for (ContoBancario conto : conti) {
                        System.out.println(conto.toString() + "\n");
                    }
                    System.out.println("\n----------            Fine stampa       ----------\n\n");
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                System.out.println("Comando non valido.\n");
                    break;
            }
        }

        scanner.close();
        return;
    }

    private void effettuaTravaso(ArrayList<ContoBancario> conti) {
        System.out.print("Inserisci numero conto da cui prelevare: ");
        String numeroConto1 = scanner.nextLine();
        System.out.print("Inserisci numero conto su cui versare: ");
        String numeroConto2 = scanner.nextLine();

        Optional<ContoBancario> conto1 = conti.stream().filter(x -> x.getNumeroConto().equals(numeroConto1)).findFirst();
        Optional<ContoBancario> conto2 = conti.stream().filter(x -> x.getNumeroConto().equals(numeroConto2)).findFirst();

        if(!conto1.isPresent() || !conto2.isPresent()) {
            System.out.println("Uno o più conti non sono stati trovati. Ritenta, sarai più fortunato.\n");
            return;
        }

        System.out.print("Inserisci importo da travasare: ");
        double importo = scanner.nextDouble();
        conto1.get().travasa(importo, conto2.get());
    }

    public void effettuaPrelievo(ArrayList<ContoBancario> conti) {
        System.out.print("Inserisci numero conto su cui effettuare un prelievo: ");
        String numeroConto = scanner.nextLine();
        Optional<ContoBancario> conto = conti.stream().filter(x -> x.getNumeroConto().equals(numeroConto)).findFirst();

        if(!conto.isPresent()) {
            System.out.println("Nessun conto trovato con questo numero.\n");
            return;
        }

        System.out.print("Inserisci importo da prelevare: ");
        double importo = scanner.nextDouble();
        conto.get().preleva(importo);
    }

    public void effettuaVersamento(ArrayList<ContoBancario> conti) {
        System.out.print("Inserisci numero conto su cui effettuare un versamento: ");
        String numeroConto = scanner.nextLine();
        Optional<ContoBancario> conto = conti.stream().filter(x -> x.getNumeroConto().equals(numeroConto)).findFirst();

        if(!conto.isPresent()) {
            System.out.println("Nessun conto trovato con questo numero.\n");
            return;
        }

        System.out.print("Inserisci importo da versare: ");
        double importo = scanner.nextDouble();
        conto.get().versa(importo);
    }    

    public ContoBancario nuovoConto() {
            
        System.out.print("Inserisci nome del titolare: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome del titolare: ");
        String cognome = scanner.nextLine();

        ContoBancario conto = new ContoBancario(nome, cognome);

        return conto;
    }
}
