package esercizi;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        // Test degli esercizi 3
        String stringa = "aaaaa";
        System.out.println(Esercizi3.contaOccorrenze(stringa, "aa"));
        String email = "test.email@example.com";
        System.out.println(Esercizi3.isValidEmailWithRegex(email));
        System.out.println(Esercizi3.isValidEmailNoRegex(email));
        System.out.println(Esercizi3.paroleDiFibonacci(5));
        System.out.println(Esercizi3.randomString(5, 20));
        System.out.println(Esercizi3.sumOfDigits(1234));
        System.out.println(Esercizi3.eliminaVocali("Questo e un esempio che mostra come il cervello umano sia in grado di riconoscere un testo alterato"));
        System.out.println(Esercizi3.stringCapitalize("Questa è una stringa capitalizzata"));


        // Test degli esercizi 4
        Esercizi4.stampArray(new int[] {1, 2, 3, 4, 5});

        int[] arr = new int[] {3, 14, 0, 3, 0, 21};

        System.out.print("Array da ordinare e da cui eliminare i duplicati: ");
        Esercizi4.stampArray(arr);
        System.out.print("Array ripulito e ordinato: ");
        Esercizi4.stampArray(Esercizi4.eliminaDuplicati(arr));
    }
}
