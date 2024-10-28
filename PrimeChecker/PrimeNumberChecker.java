package PrimeChecker;

public class PrimeNumberChecker {
    
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int number = 11;
        String numberPrime = isPrime(number) ? "prime" : "not prime";
        System.out.println("The number " + number + " is " + numberPrime);
    }
}
