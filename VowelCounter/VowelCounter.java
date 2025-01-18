package VowelCounter;

public class VowelCounter {

    public static int vowelCounter(String word) {
        String lowerWord = word.toLowerCase();
        int nVowels = 0; // To save the counted vowels
        char[] vowels = {'a','e','i','o','u'};

        for (int i = 0; i < lowerWord.length(); i++) {
            char characterToCheck = lowerWord.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (characterToCheck == vowels[j]) {
                    nVowels++;
                }
            }
        }
        return nVowels;
    }
    public static void main(String[] args) {
        String word = "murcielago";
        System.out.println(vowelCounter(word));
    }
}