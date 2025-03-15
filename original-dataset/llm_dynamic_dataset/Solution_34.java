import java.math.BigDecimal;
import java.util.*;

class HalveArray {

	public int halveArray(int[] nums) {
		PriorityQueue<BigDecimal> queue = new PriorityQueue<>();
		BigDecimal sum = BigDecimal.ZERO, curr = BigDecimal.ZERO;
		for (int num : nums) {
			sum = sum.add(BigDecimal.valueOf(num).divide(BigDecimal.valueOf(2)));
			queue.add(BigDecimal.valueOf(-num));
		}
		for (int i = 1;; i++) {
			BigDecimal poll = queue.poll().divide(BigDecimal.valueOf(2));
			if ((curr = curr.subtract(poll)).compareTo(sum) >= 0) {
				return i;
			}
			queue.add(poll);
		}
	}
	public static void main(String[] args) {
        HalveArray halveArray = new HalveArray();
        int[] nums = {10, 20, 30};
        int result = halveArray.halveArray(nums);
        System.out.println("Number of operations to halve the array sum: " + result);
    }
}