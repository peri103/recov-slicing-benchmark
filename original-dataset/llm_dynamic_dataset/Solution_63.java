class MaximumXOR {

	public int maximumXOR(int[] nums) {
		int max = 0;
		for (int num : nums) {
			max |= num;
		}
		return max;
	}
	 public static void main(String[] args) {
        MaximumXOR maximumXOR = new MaximumXOR();
        
        int[] nums = {3, 10, 5, 25, 2, 8};
        
        int result = maximumXOR.maximumXOR(nums);
        
        System.out.println("Maximum XOR: " + result);
    }
}