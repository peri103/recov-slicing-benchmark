import java.util.*;
class CountGood {

	public long countGood(int[] nums, int k) {
		long count = 0, curr = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; i < nums.length; i++, count += j) {
			curr += map.getOrDefault(nums[i], 0);
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			for (; curr >= k; j++) {
				curr -= map.put(nums[j], map.get(nums[j]) - 1) - 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1}; // Example input
        int k = 2;  // Example value for k
        CountGood countGood = new CountGood();
        long result = countGood.countGood(nums, k);
        System.out.println("Count of good subarrays: " + result);
    }
}