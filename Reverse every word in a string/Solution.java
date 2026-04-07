// Reverse every word in a string

// Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space.
// Return a string with the words in reverse order, concatenated by a single space.
class Solution {

    // Very inefficient. Too many objects created. Time Complexity is O(n2). Space Complexity is O(n).
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseWords(String s) {
        String result = "";
        String[] words = reverseString(s).split("\\s+");

        for (String word : words) {
            result += reverseString(word) + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("welcome"));
    }
}
