package ruoli;

import java.util.*;

public final class App {

    private static final Scanner scanner = new Scanner(System.in);


    private App() {
    }
    
    public static void main(String[] args) {
        
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci età: ");
        int eta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Inserisci datore di lavoro: ");
        String datore = scanner.nextLine();
        System.out.print("Inserisci salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Inserisci dipartimento: ");
        String dipartimento = scanner.nextLine();

        Dirigente dirigente = new Dirigente(nome, cognome, eta, datore, salario, dipartimento);
        dirigente.presentati();
        System.out.println(dirigente);
    }
}
