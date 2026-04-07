
class Solution {

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
