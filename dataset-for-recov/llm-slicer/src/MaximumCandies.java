class MaximumCandies {

	public int maximumCandies(int[] candies, long k) {
		long left = 0, right = 10000000;
		while (left < right) {
			long mid = (left + right + 1) / 2, count = 0;
			for (int candy : candies) {
				count += candy / mid;
			}
			if (count < k) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}
		return (int) left;
	}
	  public static void main(String[] args) {
        MaximumCandies maximumCandies = new MaximumCandies();
        
        int[] candies = {5, 8, 6};
        long k = 3;
        
        int result = maximumCandies.maximumCandies(candies, k);
        
        System.out.println("Maximum number of candies each child can get: " + result);
    }
}