// Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class Solution {

    // The logic is inefficient and contains bugs (e.g., commonPrefix.contains(s) does not account for position, and commonPrefix.charAt(i) will throw an IndexOutOfBoundsException if s is shorter than commonPrefix).
    
    // Time Complexity
    // O(S) where S is the sum of all characters in all strings, as the code iterates through each string and performs prefix comparisons involving substring operations and character matching.
    // Space Complexity
    // O(m) where m is the length of the longest string, as substring operations create new string objects that occupy additional memory.
    public static String longestCommonPrefix(String[] str) {
        if (str.length == 1) {
            return str[0];
        } 

        String commonPrefix = str[0];
        for (String s : str) {
            if (commonPrefix.contains(s)) {
                commonPrefix = s;
                continue;
            } else if (s.contains(commonPrefix)) {
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                if (commonPrefix.charAt(i) != s.charAt(i)) {
                    if (i == 0) {
                        return "";
                    }
                    commonPrefix = commonPrefix.substring(0, i);
                    break;
                }
                if (commonPrefix.length() == i + 1) {
                    commonPrefix = commonPrefix.substring(0, i + 1);
                    break;
                }
            }

        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] str = {"cdog", "cat", "canimal", "cmonkey"};

        System.out.println(Solution.longestCommonPrefix(str));
    }
}