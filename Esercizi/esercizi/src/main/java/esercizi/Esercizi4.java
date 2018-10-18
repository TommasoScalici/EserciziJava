package esercizi;

import java.util.*;

public final class Esercizi4 {

    public static void stampArray(int[] array) {
        
        if(array == null || array.length == 0) {
            System.out.println("L'array è vuoto.\n");
            return;
        }

        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if(array.length - i > 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }
    
    public static double mediaValori(int[] array) {
        
        int somma = 0;

        for (int numero : array)
            somma += numero;

        return (double)somma / (double)array.length;
    }

    public static int[] selezionaPari(int[] array) {
        
        int count = 0;

        for (int numero : array)
            if(numero % 2 == 0)
                count++;
        
        int[] pari = new int[count];

        for (int i = 0, j = 0; i < array.length; i++)
            if(array[i] % 2 == 0)
                pari[j++] = array[i];
            
        return pari;
    }

    public static int[] eliminaDuplicati(int[] array) {
        
        if(array == null || array.length == 0)
            return new int[] { };

        int count = 1;
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++)
            if(array[i] != array[i+1])
                count++;

        int[] senzaDuplicati = new int[count];

        for (int i = 0, j = 0; i < array.length - 1; i++)
        {
            if(array[i] != array[i+1])
                senzaDuplicati[j++] = array[i];
            
            if(i == array.length - 2)
                senzaDuplicati[j] = array[i + 1];
        }
        
        return senzaDuplicati;
    }
}