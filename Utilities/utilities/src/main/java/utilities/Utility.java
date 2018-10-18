package utilities;

import java.util.Arrays;
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
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w{2,6}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    public static boolean isValidEmailNoRegex(String email) {
        
        if (email == null)
            return false;

        String[] splittedString = email.split("@");

        if(splittedString.length != 2)
            return false;

        for (char c : splittedString[0].toCharArray()) {
            if(Character.isAlphabetic((int)c) || c == '.')
                continue;

            return false;
        }

        String[] splittedString2 = splittedString[1].split("\\.");

        if(splittedString2.length != 2)
            return false;
        
        if(splittedString2[1].length() < 2 || splittedString2[1].length() > 6)
            return false;

        for (char c : splittedString2[0].toCharArray()) {
            if(Character.isAlphabetic((int)c))
                continue;

            return false;
        }

        for (char c : splittedString2[1].toCharArray()) {
            if(Character.isAlphabetic((int)c))
                continue;

            return false;
        }
        
        return true;
    }

    public static String paroleDiFibonacci(int n) {

        if(n == 0)
            return "";

        if(n == 1)
            return "b";

        if(n == 2)
            return "a";

        String x = "b", y = "a", tmp;

        for(int i = 3; i <= n; i++) {
            tmp = x;
            x = y;
            y = y + tmp;
        }
        
        return y;   

    }

    /***
     * Genera una stringa casuale.
     * @param a Cardinalità dell'alfabeto (da 0 a 26).
     * @param n Lunghezza della stringa.
     * @return La stringa casuale generata.
     */
    public static String randomString(int a, int n) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++)
            builder.append((char)((int)(Math.random() * a) + 97));

        return builder.toString();
    }

    public static int sumOfDigits(int n) {
        
        int quoziente = n, sommaCifre = 0;

        while(quoziente > 0)
        {
            sommaCifre += quoziente % 10;
            quoziente /= 10;
        }

        return sommaCifre;
    }

    public static boolean isAnagram(String s, String t) {
        
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return sArr.equals(tArr);
    }

    public static String eliminaVocali(String s) {

        String temp = s;

        for (String vocal : new String[] {"a", "e", "i", "o", "u"})      
            temp = temp.replace(vocal, "");

        return temp;
    }

    public static String unary(int n) {
        
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++)
            builder.append(0);

        return builder.toString();
    }

    public static String stringCapitalize(String s) {
        
        if(s == null || s.length() == 0)
            return s;

        s = s.trim();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            
            if(i == 0 || s.charAt(i - 1) == ' ')
                builder.append(Character.toUpperCase(s.charAt(i)));
            else
                builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}