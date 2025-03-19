	class MaximumSwap {
	    public int maximumSwap(int num) {
	        char[] s = Integer.toString(num).toCharArray();
	        int n = s.length;
	        int max = -1;
	        for(int i = 0;i < n;i++){
	        	for(int j = i;j < n;j++){
	        		{char d = s[i]; s[i] = s[j]; s[j] = d;}
	        		max = Math.max(max, Integer.parseInt(new String(s)));
	        		{char d = s[i]; s[i] = s[j]; s[j] = d;}
	        	}
	        }
	        return max;
	    }
		  public static void main(String[] args) {
        MaximumSwap maximumSwap = new MaximumSwap();
        
        int num = 2736;
        
        int result = maximumSwap.maximumSwap(num);
        
        System.out.println("Maximum number after swap: " + result);
    }

	}	
