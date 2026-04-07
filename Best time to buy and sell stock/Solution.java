// Best time to buy and sell stock

// Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 
// The stock should be purchased before selling it, and both actions cannot occur on the same day.
class Solution {

    // Time complexity is O(n). Efficient.
    // The best profit made on selling the stock on a given day is the difference between the current value and the least value before the current day
    public static int stockBuySell(int[] arr, int n) {
        int maxProfit = 0, curProfit = 0, min = arr[0];

        for (int i = 1; i < n; i++) {
            curProfit = arr[i] - min;
            maxProfit = Math.max(maxProfit, curProfit);
            min = Math.min(min, arr[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int nums[] = {3, 8, 1, 4, 6, 2};
        System.out.println(stockBuySell(nums, nums.length));
    }
}
