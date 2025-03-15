	class NumberOfArrays {
	    public int numberOfArrays(String S, int k) {
	        int n = S.length();
	        char[] s = S.toCharArray();
	        long[] dp = new long[n+1];
	        dp[0] = 1;
	        int mod = 1000000007;
	        for(int i = 0;i < n;i++){
	        	if(s[i] == '0')continue;
	        	long u = 0;
	        	for(int j = i;j < n;j++){
	        		u = u * 10 + (s[j]-'0');
	        		if(u >= 1 && u <= k){
	        			dp[j+1] += dp[i];
	        			if(dp[j+1] >= mod)dp[j+1] -= mod;
	        		}else{
	        			break;
	        		}
	        	}
	        }
	        return (int)dp[n];
	    }
		 public static void main(String[] args) {
        NumberOfArrays numberOfArrays = new NumberOfArrays();
        
        String S = "1317";
        int k = 10;
        
        int result = numberOfArrays.numberOfArrays(S, k);
        
        System.out.println("Number of ways to split the string: " + result);
    }
	}	
