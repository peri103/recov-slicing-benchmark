	class MinFlips {
	    public int minFlips(int[][] mat) {
	        int u = 0;
	        int n = mat.length, m = mat[0].length;
	        for(int i = 0;i < mat.length;i++){
	        	for(int j = 0;j < mat[0].length;j++){
	        		u |= mat[i][j]<<i*mat[0].length+j;
	        	}
	        }
	        int[] ptns = new int[n*m];
	        for(int i = 0;i < n;i++){
	        	for(int j = 0;j < m;j++){
	        		for(int k = 0;k < n;k++){
	        			for(int l = 0;l < m;l++){
	        				if(Math.abs(i-k) + Math.abs(j-l) <= 1){
	        					ptns[i*m+j] |= 1<<k*m+l;
	        				}
	        			}
	        		}
	        	}
	        }
	        
	        int ans = 99;
	        for(int i = 0;i < 1<<n*m;i++){
	        	int v = u;
	        	for(int j = 0;j < n*m;j++){
	        		if(i<<~j<0){
	        			v ^= ptns[j];
	        		}
	        	}
	        	if(v == 0){
	        		ans = Math.min(ans, Integer.bitCount(i));
	        	}
	        }
	        if(ans == 99)return -1;
	        return ans;
	    }
	public static void main(String[] args) {
        MinFlips minFlips = new MinFlips();
        
        int[][] mat = {
            {0, 0},
            {0, 1}
        };
        
        int result = minFlips.minFlips(mat);
        
        System.out.println("Minimum number of flips: " + result);
    }
	}	
