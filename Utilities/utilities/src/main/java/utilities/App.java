package utilities;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        String stringa = "Ho pescacascato una scarpa";
        System.out.println(Utility.contaOccorrenze(stringa, "sca"));
        String email = "tommaso.scalici@outlook.it";
        System.out.println(Utility.isValidEmailWithRegex(email));
    }
}
