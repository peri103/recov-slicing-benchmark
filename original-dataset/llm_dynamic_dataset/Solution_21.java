	import java.util.*;
	class DeleteString {
		public int deleteString(String S) {
			char[] s = S.toCharArray();
			int n = s.length;
			int[] dp = new int[n];
			for(int i = n-1;i >= 0;i--){
				char[] t = Arrays.copyOfRange(s, i, n);
				int[] z = Z(t);
				dp[i] = 1;
				for(int j = 1;2*j <= t.length;j++){
					if(z[j] >= j){
						dp[i] = Math.max(dp[i], dp[i+j] + 1);
					}
				}
			}
			return dp[0];
		}

		public int[] Z(char[] str)
		{
			int n = str.length;
			int[] z = new int[n];
			if(n == 0)return z;
			z[0] = n;
			int l = 0, r = 0;
			for(int i = 1;i < n;i++){
				if(i > r){
					l = r = i;
					while(r < n && str[r-l] == str[r])r++;
					z[i] = r-l; r--;
				}else{
					if(z[i-l] < r-i+1){
						z[i] = z[i-l];
					}else{
						l = i;
						while(r < n && str[r-l] == str[r])r++;
						z[i] = r-l; r--;
					}
				}
			}

			return z;
		}
	 public static void main(String[] args) {
        DeleteString deleteString = new DeleteString();
        String input = "abcabcdabc";
        int result = deleteString.deleteString(input);
        System.out.println("The maximum number of deletions: " + result);
    }

	}
