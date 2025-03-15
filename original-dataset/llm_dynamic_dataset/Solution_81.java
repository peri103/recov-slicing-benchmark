

import java.util.*;

public class NumSubseq {
    public static void main(String[] args) {
        int[] input = new int[]{};
        int[] output = new int[]{2, 3};
        System.out.println(new NumSubseq());
    }

    public int numSubseq(int[] a, int target) {
        int n = a.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, 0, n, (Integer x, Integer y) -> a[x] == a[y] ? Integer.compare(x, y) : Integer.compare(a[x], a[y]));
        int r = 0;
        int[] pow2 = new int[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = pow2[i - 1] * 2 % mod;
        }
        int ans = 0;
        //System.out.println(Arrays.deepToString(indices));
        r = n - 1;
        for (int i = 0; i < n; i++) {
            r = Math.max(r, i);
            while (r - 1 >= i && a[indices[r]] + a[indices[i]] > target) {
                r--;
            }
           // System.out.println(indices[i] + ":" + r);
            if (a[indices[r]] + a[indices[i]] <= target) {
                int cnt = r - i;
                ans = (ans + pow2[cnt]) % mod;
            }
            
        }
        
        return ans;
    }

    int mod = (int) (1e9 + 7);
}
