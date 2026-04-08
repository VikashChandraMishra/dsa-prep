// Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

import java.util.Arrays;

class Solution {
    // Time Complexity
    // O(N * M * log N) where N is the number of strings and M is the maximum length of a string; Arrays.sort takes O(N * log N * M) time, and the final loop takes O(M) time.
    // Space Complexity
    // O(M) where M is the maximum length of a string to store the commonPrefix result; the sorting algorithm space complexity depends on the implementation, typically O(log N) or O(N).

    // Concat operation within a loop creates many string objects increasing space complexity
    public static String longestCommonPrefix(String[] str) {
        if (str.length == 1) {
            return str[0];
        } 

        int i = 0;
        Arrays.sort(str);
        String commonPrefix = "", firstString = str[0], lastString = str[str.length - 1];

        while (i < firstString.length() && firstString.charAt(i) == lastString.charAt(i)) {
            commonPrefix += firstString.charAt(i);
            i++;
        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] str = {"test","test","test"};

        System.out.println(Solution.longestCommonPrefix(str));
    }
}