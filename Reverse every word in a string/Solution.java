
import java.util.Arrays;

// Reverse every word in a string
// Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space.
// Return a string with the words in reverse order, concatenated by a single space.
class Solution {

    // Very inefficient. Too many objects created. Time Complexity is O(n2). Space Complexity is O(n).
    // This is more concise and functional than the previous approach.
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseWords(String s) {
        String[] words = reverseString(s).split("\\s+");

        Arrays.parallelSetAll(words, i -> reverseString(words[i]));
        String result = String.join(" ", words);

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("welcome"));
    }
}
