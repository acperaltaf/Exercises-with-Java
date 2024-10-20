package PalindromeChecker;

public class PalindromeChecker {
    public static void main(String[] args) {
        String[] words = {"Bugdi", "Radar", "Amor a Roma"};
        isPalindrome(words[2]);
    }
    
    public static void isPalindrome(String word) {

        // Convert to lowercase and remove whitespace
        word = word.toLowerCase().replaceAll("\\s+", "");
        StringBuilder invertedWord = new StringBuilder();

        // Reverse the word
        for (int i = word.length() - 1; i >= 0; i--) {
            invertedWord.append(word.charAt(i));
        }
        
        System.out.printf("Reverse word: %s \n", invertedWord);

        if (invertedWord.toString().equals(word)) {
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Is not a palindrome");
        }
        System.out.println();

    }
}
