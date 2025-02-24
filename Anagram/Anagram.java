package Anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        // Remove whitespaces and convert to lower case
        String str1WithotSpaces = str1.replaceAll("\\s+", "").toLowerCase();
        String str2WithotSpaces = str2.replaceAll("\\s+", "").toLowerCase();

        // Convert strings to a character array  
        char[] arrStr1 = str1WithotSpaces.toCharArray();
        char[] arrStr2 = str2WithotSpaces.toCharArray();

        // Sort the character arrays
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        return Arrays.equals(arrStr1, arrStr2);
        // return arrStr1 == arrStr2;
    }
    public static void main(String[] args) {
        /* Examples:
         * A gentleman
         * Elegant man
         */
        String str1 = "Dormitory";
        String str2 = "Dirty room";

        System.out.printf("The strings \"%s\" and \"%s\" are anagrams: %b", str1, str2, isAnagram(str1, str2));
    }
}
