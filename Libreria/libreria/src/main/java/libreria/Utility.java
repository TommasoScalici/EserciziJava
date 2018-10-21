package libreria;

public class Utility {

    public static String arrayToString(Object[] array) {
        
        StringBuilder builder = new StringBuilder();

        if(array == null || array.length == 0)
            return builder.toString();
        
        builder.append("[");

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);

            if(array.length - i > 1)
                builder.append(", ");
        }

        builder.append("]");

        return builder.toString();
    }    
}