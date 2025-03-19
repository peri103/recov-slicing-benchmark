	public class KInversePairs {
	    public int kInversePairs(int n, int k) {
	    	long[] dp = new long[k+n+2];
	    	int mod = 1000000007;
	    	dp[0] = 1;
	    	for(int i = 1;i <= n;i++){
	    		for(int j = dp.length-1-i;j >= 0;j--){
	    			dp[j+i] -= dp[j];
	    			if(dp[j+i] < 0)dp[j+i] += mod;
	    		}
	    	}
	    	for(int i = 1;i <= n;i++){
	    		for(int j = 0;j < dp.length-1;j++){
	    			dp[j+1] += dp[j];
	    			dp[j+1] %= mod;
	    		}
	    	}
	    	return (int)dp[k];
	    }
		public static void main(String[] args) {
        KInversePairs kInversePairs = new KInversePairs();
        int n = 3;
        int k = 1;
        int result = kInversePairs.kInversePairs(n, k);
        
        System.out.println("Number of arrays with " + k + " inverse pairs for n = " + n + ": " + result);
    }
	}
