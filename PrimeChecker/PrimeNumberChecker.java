package PrimeChecker;

public class PrimeNumberChecker {
    
    public static boolean isPrime(int number) {
        // boolean isPrime = true;
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 11;
        String numberPrime = isPrime(number) ? "prime" : "not prime";
        System.out.println("The number " + number + " is " + numberPrime);
    }
}
