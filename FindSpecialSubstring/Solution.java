package FindSpecialSubstring;

public class Solution {
    public static void main(String[] args) {
        // Valid string
        String valid = "Love youuu";
        // Invalid string
        String invalid = "Love you";

        System.out.println(hasSpecialSubstring(valid, 3));  // true
        System.out.println(hasSpecialSubstring(invalid, 3));  // false

        // Ejemplos del problema
        System.out.println(hasSpecialSubstring("aaabaaa", 3));  // true
        System.out.println(hasSpecialSubstring("abc", 2));      // false
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        // Si la cadena es más corta que k, no hay subcadena posible
        if (s.length() < k) return false;

        // Recorre todas las subcadenas de longitud k
        for (int i = 0; i <= s.length() - k; i++) {
            // Paso 1: Verifica si la subcadena tiene un solo carácter repetido
            char currentChar = s.charAt(i);
            boolean allSame = true;
            for (int j = 1; j < k; j++) {
                if (s.charAt(i + j) != currentChar) {
                    allSame = false;
                    break;
                }
            }

            // Si todos los caracteres son iguales, verifica los adyacentes
            if (allSame) {
                // Paso 2: Verifica el carácter anterior (si existe)
                boolean validBefore = true;
                if (i > 0) {  // Hay un carácter antes
                    char beforeChar = s.charAt(i - 1);
                    validBefore = (beforeChar != currentChar);
                }

                // Paso 3: Verifica el carácter posterior (si existe)
                boolean validAfter = true;
                if (i + k < s.length()) {  // Hay un carácter después
                    char afterChar = s.charAt(i + k);
                    validAfter = (afterChar != currentChar);
                }

                // Si ambas condiciones se cumplen, encontramos una subcadena válida
                if (validBefore && validAfter) {
                    return true;
                }
            }
        }

        // No se encontró ninguna subcadena válida
        return false;
    } // End hasSpecialSubstring
} // End Solution