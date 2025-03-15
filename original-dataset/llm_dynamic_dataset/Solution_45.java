import java.util.*;
class LenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] A) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            s.put(A[i], i);
        }
        int[][] dp = new int[n][n];
        int max = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j < n; ++j) {
                int next = A[i]+A[j];
                if (s.containsKey(next)) {
                    int k = s.get(next);
                    dp[i][j] = dp[j][k]+1;
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 2;
                }
            }
        }
        return max;
    }
     public static void main(String[] args) {
        LenLongestFibSubseq lenLongestFibSubseq = new LenLongestFibSubseq();
        int[] A = {1, 3, 7, 11, 12, 14, 18};
        
        int result = lenLongestFibSubseq.lenLongestFibSubseq(A);
        
        System.out.println("Length of the longest Fibonacci-like subsequence: " + result);
    
}
}