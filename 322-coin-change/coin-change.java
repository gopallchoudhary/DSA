class Solution {
    public int coinChange(int[] coins, int amount) {
         int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Base case: zero coins needed to make amount 0

        // Iterate over each amount from 1 to the target amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    // If it's possible to use this coin, update the dp array
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If the amount is not achievable, dp[amount] will be Integer.MAX_VALUE
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}