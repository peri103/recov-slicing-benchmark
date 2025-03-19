class CountQuadruplets {

	public long countQuadruplets(int[] nums) {
		int[][] left = new int[nums.length][nums.length], right = new int[nums.length][nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				left[j + 1][i] = left[j][i] + (nums[j] < nums[i] ? 1 : 0);
			}
			for (int j = nums.length - 1; j > i; j--) {
				right[i][j - 1] = right[i][j] + (nums[j] > nums[i] ? 1 : 0);
			}
		}
		long count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				count += nums[i] > nums[j] ? left[i + 1][j] * right[i][j - 1] : 0;
			}
		}
		return count;
	}
	public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5}; // Example input
        CountQuadruplets countQuadruplets = new CountQuadruplets();
        long result = countQuadruplets.countQuadruplets(nums);
        System.out.println("Count of quadruplets: " + result);
    }
}