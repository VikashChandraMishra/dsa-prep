// Best time to buy and sell stock

// Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 

// The stock should be purchased before selling it, and both actions cannot occur on the same day.


class Solution {

    // Time complexity is O(n2). Inefficient.
    public static int stockBuySell(int[] arr, int n) {
        int profit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] > profit) {
                    profit = arr[j] - arr[i];
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int nums[] = {3, 8, 1, 4, 6, 2};
        System.out.println(stockBuySell(nums, nums.length));
    }
}
