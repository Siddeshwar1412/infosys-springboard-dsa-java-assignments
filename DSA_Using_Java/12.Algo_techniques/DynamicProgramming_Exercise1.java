class Tester {
    
    public static int cutRod(int[] price, int n) {
        int[] dp = new int[n + 1];  // dp[i] stores the maximum price for rod length i

        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, price[j] + dp[i - j - 1]);
            }
            dp[i] = max;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;
        System.out.println("Maximum price: " + cutRod(price, n));
    }
}
