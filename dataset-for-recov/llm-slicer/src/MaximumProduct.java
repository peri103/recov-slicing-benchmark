import java.util.*;

class MaximumProduct {

  public int maximumProduct(int[] nums, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int num : nums) {
      queue.offer(num);
    }
    for (int i = 0; i < k; i++) {
      queue.offer(queue.poll() + 1);
    }
    long prod = 1;
    for (int num : queue) {
      prod = prod * num % 1000000007;
    }
    return (int) prod;
  }
  public static void main(String[] args) {
    MaximumProduct mp = new MaximumProduct();
    int[] nums = {1, 2, 3, 4};
    int k = 2;
    int result = mp.maximumProduct(nums, k);
    System.out.println("The maximum product is: " + result);
}
}
