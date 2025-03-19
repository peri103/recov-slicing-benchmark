class MinimumReplacement {

	public long minimumReplacement(int[] nums) {
		long count = 0;
		for (int i = nums.length - 2, j = nums[nums.length - 1]; i >= 0; i--) {
			count += (nums[i] - 1) / j;
			j = nums[i] / ((nums[i] + j - 1) / j);
		}
		return count;
	}
	  public static void main(String[] args) {
        MinimumReplacement minimumReplacement = new MinimumReplacement();
        
        int[] nums = {5, 6, 7, 8};
        
        long result = minimumReplacement.minimumReplacement(nums);
        
        System.out.println("Minimum replacements needed: " + result);
    }
}