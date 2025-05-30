
    public class MinSumSquareOff {

        public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
            long nums[] = new long[nums1.length], left = 0, right = 1000000000, count = 0, result = 0;
            for (int i = 0; i < nums1.length; i++) {
                nums[i] = Math.abs(nums1[i] - nums2[i]);
            }
            while (left < right) {
                long mid = (left + right) / 2, sum = 0;
                for (long num : nums) {
                    sum += Math.max(0, num - mid);
                }
                if (sum > k1 + k2) {
                    left = mid + 1;
                } else {
                    right = mid;
                    count = k1 + k2 - sum;
                }
            }
            for (long num : nums) {
                result += Math.pow(num < left ? num : left - Math.min(1, Math.max(0, count--)), 2);
            }
            return left > 0 ? result : 0;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 4};
            int[] nums2 = {2, 3, 4, 5};
            int k1 = 1;
            int k2 = 2;

            MinSumSquareOff solution = new MinSumSquareOff();

            long result = solution.minSumSquareDiff(nums1, nums2, k1, k2);

            System.out.println("Minimum Sum of Squared Differences: " + result);
        }
    }
    