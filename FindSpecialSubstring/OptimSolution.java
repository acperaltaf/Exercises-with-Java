package FindSpecialSubstring;

public class OptimSolution {
    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println(hasSpecialSubstring("aaabaaa", 3));  // true
        System.out.println(hasSpecialSubstring("abc", 2));      // false
        System.out.println(hasSpecialSubstring("Love youuuu", 3));  // false
        System.out.println(hasSpecialSubstring("abcccde", 3));  // true
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        // Si la cadena es más corta que k, no hay solución
        if (s.length() < k) return false;

        // Recorre todas las subcadenas de longitud k
        for (int i = 0; i <= s.length() - k; i++) {
            // Toma el primer carácter de la subcadena como referencia
            char ch = s.charAt(i);
            
            // Verifica si los k caracteres desde i son todos iguales a ch
            int j = i + 1;
            while (j < i + k && s.charAt(j) == ch) {
                j++;
            }
            // Si j llegó a i + k, todos los caracteres son iguales
            if (j == i + k) {
                // Verifica el carácter anterior (si i > 0)
                if (i > 0 && s.charAt(i - 1) == ch) {
                    continue; // Anterior igual, no válido
                }
                // Verifica el carácter posterior (si i + k < s.length())
                if (i + k < s.length() && s.charAt(i + k) == ch) {
                    continue; // Posterior igual, no válido
                }
                // Si pasa ambas verificaciones, encontramos una subcadena válida
                return true;
            }
        }
        return false;
    }
}