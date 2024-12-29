package LuhnAlgorithm;
public class LuhnCheck {
    public static boolean luhnCheck(String number) {

        // Eliminar espacios en blanco si los hay
        number = number.replaceAll("\\s", "");

        // Validación de entrada
        if (number == null || number.isEmpty() || !number.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        boolean doubleDigit = false;  // Empezamos con false porque procesamos de derecha a izquierda

        // Procesamos directamente el string de derecha a izquierda
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            
            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return (sum % 10 == 0);
    }
    
    public static void main(String[] args) {
        String[] testNumbers = {
            "61789372994",  // válido
            "4532015112830367",  // inválido
            "",             // inválido
            "5191732343975393", 
            "4532015112830367",
            "6011 0009 90139 424"
        };
        
        for (String number : testNumbers) {
            System.out.println("Número: " + number);
            System.out.println("Es válido: " + luhnCheck(number));
        }
    }
}
