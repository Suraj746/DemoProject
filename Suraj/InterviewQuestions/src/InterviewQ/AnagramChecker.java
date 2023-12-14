package InterviewQ;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create character frequency arrays
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        // Count character occurrences in the first string
        for (char c : str1.toCharArray()) {
            charCount1[c - 'a']++;
        }

        // Count character occurrences in the second string
        for (char c : str2.toCharArray()) {
            charCount2[c - 'a']++;
        }

        // Compare character frequency arrays
        return Arrays.equals(charCount1, charCount2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

