import java.util.*;
class LongestStrChain {
boolean check(String a, String b) {
        int idx = 0;
        for (;idx < a.length(); idx++) if (a.charAt(idx) != b.charAt(idx)) break;
        for (;idx < a.length(); idx++) if (a.charAt(idx) != b.charAt(idx+1)) break;
        return idx >= a.length();
    }


    public int longestStrChain(String[] words) {
        int n = words.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
            String a = words[i];
            String b = words[j];
            if (a.length() + 1 == b.length() && check(a, b)) {
                graph.get(i).add(j);
            }
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int res = 0;
        for (int i = 0; i < n; i++) if (dp[i] == -1) {
            res = Math.max(res, solve(dp, i, graph));
        }
        return res;
    }

    private int solve(int[] dp, int cur, List<List<Integer>> graph) {
        if (dp[cur] != -1) return dp[cur];
        int res = 1;
        for (int to: graph.get(cur)) {
            res = Math.max(res, solve(dp, to, graph) + 1);
        }
        return dp[cur] = res;
    }
     public static void main(String[] args) {
        LongestStrChain longestStrChain = new LongestStrChain();
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        
        int result = longestStrChain.longestStrChain(words);
        
        System.out.println("Length of the longest string chain: " + result);
    }

}