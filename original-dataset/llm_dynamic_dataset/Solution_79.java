public class NextGreaterElement {
    public int nextGreaterElement(int n) {
        char[] s = Integer.valueOf(n).toString().toCharArray();
        nextPermutation(s);
        try{
            int ans = Integer.valueOf(String.valueOf(s));
            if (ans <= n) {
                return -1;
            }
            return ans;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(char[] nums) {
        //sanity check
        if (nums == null || nums.length <= 1) {
            return;
        }

        //find i
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        //swap i and j
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        //reverse nums[i+1, n-1]
        for (int p = i + 1, q = nums.length - 1; p < q; p++, q--) {
            swap(nums, p, q);
        }
    }
      public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        
        int n = 12;
        
        int result = nextGreaterElement.nextGreaterElement(n);
        
        System.out.println("Next greater element: " + result);
    }
}