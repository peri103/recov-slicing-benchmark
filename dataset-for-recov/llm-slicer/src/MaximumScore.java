class MaximumScore {
    public int maximumScore(int[] nums, int[] muls) {
        int n = nums.length;
        int m = muls.length;
        int[][] dp = new int[m+1][m+1];
        for (int z = m-1; z>=0; --z) {
            for (int i = 0; i <= z; ++i) {
                int y = z-i;
                int j = n-y-1;
                dp[i][y] = Math.max(dp[i+1][y]+nums[i]*muls[z], dp[i][y+1]+nums[j]*muls[z]);
                //System.out.println(i+" "+y+" "+j+" "+dp[i][y]);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        MaximumScore maximumScore = new MaximumScore();
        
        int[] nums = {1, 2, 3};
        int[] muls = {3, 2, 1};
        
        int result = maximumScore.maximumScore(nums, muls);
        
        System.out.println("Maximum score: " + result);
    }
}