// Sort an array of 0's 1's and 2's

// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
// The sorting must be done in-place, without making a copy of the original array.
class Solution {

    // Time complexity is O(n)
    // Space complexity is O(1)
    public static void sortZeroOneTwo(int[] nums) {
        int zeroes = 0, ones = 0, twos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else if (nums[i] == 1) {
                ones++;
            } else if (nums[i] == 2) {
                twos++;
            }
        }

        int i = 0;

        for (int j = 0; j < zeroes; i++, j++) {
            nums[i] = 0;
        }

        for (int j = 0; j < ones; i++, j++) {
            nums[i] = 1;
        }

        for (int j = 0; j < twos; i++, j++) {
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 1, 0};
        sortZeroOneTwo(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
