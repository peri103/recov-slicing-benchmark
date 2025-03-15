class MinimumMountainRemovals {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        
        for (int i = 1; i < n; i++) {
            left[i] = i;
            
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    left[i] = Math.min(left[i], left[j] + (i - j - 1));
                }
            }
        }
        
        int[] right = new int[n];
        
        for (int i = n - 2; i >= 0; i--) {
            right[i] = n - i - 1;
            
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    right[i] = Math.min(right[i], right[j] + (j - i - 1));
                }
            }
        }
        
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            answer = Math.min(answer, left[i] + right[i]);
        }
        
        return answer;
    }
      public static void main(String[] args) {
        MinimumMountainRemovals minimumMountainRemovals = new MinimumMountainRemovals();
        
        int[] nums = {2, 1, 1, 5, 6, 2, 3, 1};
        
        int result = minimumMountainRemovals.minimumMountainRemovals(nums);
        
        System.out.println("Minimum mountain removals: " + result);
    }
}