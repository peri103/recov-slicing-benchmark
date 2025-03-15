	class FindGoodStrings {
    	int mod = 1000000007;
	    public int findGoodStrings(int n, String s1, String s2, String evil) {
	    	int[] mp = mpTable(evil.toCharArray());
	    	long ret = count(s2.toCharArray(), n, mp, evil.toCharArray()) - count(s1.toCharArray(), n, mp, evil.toCharArray()) + mod;
	    	if(s1.indexOf(evil) < 0)ret++;
	    	return (int)(ret%mod);
//	    	int p = 0;
//	    	for(int i = 0;i < haystack.length;i++){
//	    		while(p >= 0 && needle[p] != haystack[i])p = kmp[p];
//	    		if(++p == needle.length){
//	    			out.println(i-needle.length+1);
//	    			p = kmp[p];
//	    		}

	    }
	    
	    long count(char[] s, int n, int[] mp, char[] needle)
	    {
	    	int m = mp.length-1;
	    	long[] dp = new long[m];
	    	dp[0] = 1;
	    	int edge = 0;
	    	for(int i = 0;i < n;i++){
	    		long[] ndp = new long[m];
	    		for(int j = 0;j < m;j++){
	    			for(int k = 0;k < 26;k++){
	    				int p = j;
	    	    		while(p >= 0 && needle[p]-'a' != k){
	    	    			p = mp[p];
	    	    		}
	    	    		if(++p < needle.length){
	    	    			ndp[p] += dp[j];
	    	    			if(ndp[p] >= mod)ndp[p] -= mod;
	    	    		}
	    			}
	    		}
	    		if(edge != needle.length){
		    		for(int k = 0;k < s[i]-'a';k++){
	    				int p = edge;
	    	    		while(p >= 0 && needle[p]-'a' != k){
	    	    			p = mp[p];
	    	    		}
	    	    		if(++p < needle.length){
	    	    			ndp[p] += 1;
	    	    			if(ndp[p] >= mod)ndp[p] -= mod;
	    	    		}
		    		}
		    		
    				int p = edge;
    	    		while(p >= 0 && needle[p] != s[i]){
    	    			p = mp[p];
    	    		}
    	    		++p;
    	    		edge = p;
	    		}
	    		
	    		dp = ndp;
	    	}
	    	
	    	long ret = 0;
	    	if(edge != needle.length)ret++;
	    	for(long v : dp)ret += v;
	    	return ret%mod;
	    }
	    
		public int[] mpTable(char[] str)
		{
			int n = str.length;
			int[] mp = new int[n+1];
			mp[0] = -1;
			for(int i = 1, j = 0;i < n;i++){
				while(j >= 0 && str[i] != str[j])j = mp[j];
				mp[i+1] = ++j;
			}
			return mp;
		}
	public static void main(String[] args) {
		FindGoodStrings findGoodStrings = new FindGoodStrings();
		int n = 3;
		String s1 = "abc";
		String s2 = "bcd";
		String evil = "c";

		int result = findGoodStrings.findGoodStrings(n, s1, s2, evil);
		System.out.println("Number of good strings: " + result);
}

	}	
