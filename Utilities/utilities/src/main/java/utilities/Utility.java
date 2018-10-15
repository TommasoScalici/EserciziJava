package utilities;

import java.util.regex.*;

public final class Utility {

    public static String iniziali(String nome, String cognome) {
        return nome.charAt(0) + "&" + cognome.charAt(0);
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static int contaOccorrenze(String string, String patternString) {
        int count = 0, i = 0;
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find(i)) {
            count++;
            i = matcher.start() + 1;
        }

        return count;
    }

    public static boolean isValidEmailWithRegex(String email) {
        Pattern pattern = Pattern.compile("[A-Z0-9._]+@[A-Z0-9._]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    public static boolean isValidEmailNoRegex(String email) {
        boolean isValid = true;

        int index = 0;

        for (int i = 0; i < email.length(); i++) {
            if(Character.isAlphabetic((int)email.charAt(i)) || email.charAt(i) == '.')
                continue;

            index = i;
            break;
        }

        if(index < email.length() && email.charAt(index) == '@')
            index++;
        else
            isValid = false;

        for (int i = index; i < email.length(); i++) {
            if(Character.isAlphabetic((int)email.charAt(i)))
                continue;
    
            index = i;
            break;
        }

        

        return isValid;
    }
}