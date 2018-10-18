package utilities;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        String stringa = "aaaaa";
        System.out.println(Utility.contaOccorrenze(stringa, "aa"));
        String email = "test.email@example.com";
        System.out.println(Utility.isValidEmailWithRegex(email));
        System.out.println(Utility.isValidEmailNoRegex(email));
        System.out.println(Utility.paroleDiFibonacci(5));
        System.out.println(Utility.randomString(5, 20));
        System.out.println(Utility.sumOfDigits(1234));
        System.out.println(Utility.eliminaVocali("Questo e un esempio che mostra come il cervello umano sia in grado di riconoscere un testo alterato"));
        System.out.println(Utility.stringCapitalize("Questa è una stringa capitalizzata"));
    }
}
