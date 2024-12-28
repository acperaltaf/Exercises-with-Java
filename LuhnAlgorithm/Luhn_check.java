package LuhnAlgorithm;
public class Luhn_check {

    
    public static boolean luhn_check(String number) {
        int sum = 0;
        int nDigits = number.length();
        int[] arrIntReversedNumber = new int[nDigits];

        String reversedNumber = new StringBuilder(number).reverse().toString();

        for (int i = 0; i < nDigits; i++) {
            arrIntReversedNumber[i] = Character.getNumericValue(reversedNumber.charAt(i));
        }

        
        for (int i = 0; i < nDigits; i+=2) {
            arrIntReversedNumber[i] *= 2;
            if (arrIntReversedNumber[i] > 9) {
                arrIntReversedNumber[i] = (arrIntReversedNumber[i] - 10) + 1;
            }
        }
        
        for (int i : arrIntReversedNumber) {
            sum += i;
        }
        
        // Imprimir el contenido del arreglo usando Arrays.toString() 
        // System.out.println("Array de números invertidos: " + java.util.Arrays.toString(arrIntReversedNumber));
         
        System.out.println(sum);
        
        return (sum % 10 == 0);
    }
    
    public static void main(String[] args) {
        String number = "61789372994";
        System.out.println(luhn_check(number));
    }
}
