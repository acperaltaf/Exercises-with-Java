package FactorialCalculation;


public class FactorialCalculation {
    public static void main(String[] args) {
        int number = -3;
        System.out.println(factorial(number));
        // System.out.println();

        
    }

    public static int factorial(int num) {
        int factorial = 1;

        // WARNING: The factorial of a negative number is not defined in mathematics.
        if (num < 0) {
            num *= -1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            factorial *= -1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
