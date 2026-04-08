// Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class Solution {
    // Time Complexity
    // O(N * M), where N is the number of strings and M is the average length of the strings. The initial loop iterates through N strings, performing lexicographical comparisons taking O(M) time, resulting in O(N * M). The final while loop compares characters of the shortest and longest strings, taking O(M) time.
    // Space Complexity
    // O(M), where M is the length of the shortest string, as the StringBuilder stores the resulting common prefix.

    // Stringbuilder concatenations prevents creation of unnecessary string objects
    // Not sorting greatly reduces the time complexity
    public static String longestCommonPrefix(String[] str) {
        if (str.length == 1) {
            return str[0];
        } 

        StringBuilder commonPrefix = new StringBuilder();
        String min = str[0], max = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(min) < 0) {
                min = str[i];
            } else if (str[i].compareTo(max) > 0) {
                max = str[i];
            }
        }

        int i = 0;
        while (i < min.length() && min.charAt(i) == max.charAt(i)) {
            commonPrefix.append(min.charAt(i));
            i++;
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] str = {"test","test","test"};

        System.out.println(Solution.longestCommonPrefix(str));
    }
}