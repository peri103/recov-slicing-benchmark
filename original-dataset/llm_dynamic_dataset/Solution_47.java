import java.util.*;
class LongestSubarray {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int max = 0;
        int a = 0;
        for (int i = 0; i < n; ++i) {
            if (!tm.containsKey(nums[i])) {
                tm.put(nums[i],1);
            } else {
                tm.put(nums[i],tm.get(nums[i])+1);
            }
            while (tm.lastKey()-tm.firstKey()>limit) {
                tm.put(nums[a], tm.get(nums[a])-1);
                if (tm.get(nums[a])==0)
                    tm.remove(nums[a]);
                a++;
            }
            max = Math.max(max,i-a+1);
        }
        return max;
    }
      public static void main(String[] args) {
        LongestSubarray longestSubarray = new LongestSubarray();
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        
        int result = longestSubarray.longestSubarray(nums, limit);
        
        System.out.println("Length of the longest subarray: " + result);
    }
}