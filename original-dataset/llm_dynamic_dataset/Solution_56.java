import java.util.*;

class MaxSatisfaction {
    public int maxSatisfaction(int[] sf) {
        Arrays.sort(sf);
        int n = sf.length;
        int curr = 0;
        int ans = 0;
        int sum = 0;
        for (int i = n-1; i>=0; --i) {
            sum+=sf[i];
            curr+=sum;
            ans = Math.max(ans,curr);
        }
        return ans;
    }
      public static void main(String[] args) {
        MaxSatisfaction maxSatisfaction = new MaxSatisfaction();
        
        int[] sf = {-1, -8, 0, 5, -9};
        
        int result = maxSatisfaction.maxSatisfaction(sf);
        
        System.out.println("Maximum satisfaction: " + result);
    }
}