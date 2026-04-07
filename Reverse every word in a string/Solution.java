// Reverse every word in a string
// Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space.
// Return a string with the words in reverse order, concatenated by a single space.
class Solution {

    // Efficient. Time Complexity is O(n). Space Complexity is O(n).
    public static void reverseWordArray(String[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        reverseWordArray(words);
        String result = String.join(" ", words);
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("amazing coding skills "));
    }
}
