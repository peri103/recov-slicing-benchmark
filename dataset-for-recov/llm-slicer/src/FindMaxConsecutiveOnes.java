public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, con = 0, res = 0;
        int[] dp = new int [n];
        for (int i = 0; i < n; i ++) {
            if (nums[i] == 1) {
                con ++;
                dp[i] = con;
            } else {
                con = 0;
            }
        }
        con = 0;
        for (int i = n - 1; i >= 0; i --) {
            int head = i - 1 >= 0 ? dp[i - 1] : 0;
            int one = head + con + 1;
            res = Math.max(one, res);
            if (nums[i] == 1) {
                con ++;
            } else con = 0;
        }
        return res;
    }
    public static void main(String[] args) {
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        int[] nums = {1, 0, 1, 1, 0};
        int result = findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive ones: " + result);
    }
}