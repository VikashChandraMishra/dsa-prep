// Sort an array of 0's 1's and 2's

// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
// The sorting must be done in-place, without making a copy of the original array.
class Solution {

    // Time complexity is O(n) // Single pass
    // Space complexity is O(1)
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Uses Dutch National Flag algorithm
    // Assumes 
    // 0 -> low = 0 .i.e., low is the right boundary of zeroes
    // low -> mid - 1 = 1 .i.e., mid - 1 is the right boundary of ones
    // mid + 1 -> high = Unknown. This is what needs to be sorted.
    // high + 1 -> end = 2 .i.e., high + 1 is the left boundary of twos 
    public static void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
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
