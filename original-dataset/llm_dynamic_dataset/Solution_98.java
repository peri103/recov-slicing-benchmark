	class TilingRectangle {
	    public int tilingRectangle(int n, int m) {
	    	ans = 99999999;
	        boolean[][] g = new boolean[n][m];
	        dfs(0, 0, g, 0);
	        return ans;
	    }
	    
	    int ans;
	    
	    void dfs(int r, int c, boolean[][] g, int num)
	    {
	    	int n = g.length, m = g[0].length;
	    	if(num >= ans)return;
	    	if(r >= n){
	    		ans = num;
	    		return;
	    	}
	    	if(c >= m){
	    		dfs(r+1, 0, g, num); return;
	    	}
	    	if(g[r][c]){
	    		dfs(r, c+1, g, num); return;
	    	}
	    	out:
	    	for(int K = Math.min(n-r, m-c);K >= 1;K--){
	    		for(int i = 0;i < K;i++){
	    			for(int j = 0;j < K;j++){
	    				if(g[r+i][c+j])break out;
	    			}
	    		}
	    		for(int i = 0;i < K;i++){
	    			for(int j = 0;j < K;j++){
	    				g[r+i][c+j] = true;
	    			}
	    		}
	    		dfs(r, c+1, g, num+1);
	    		for(int i = 0;i < K;i++){
	    			for(int j = 0;j < K;j++){
	    				g[r+i][c+j] = false;
	    			}
	    		}
	    	}
	    }
	    
		public void tf(boolean[]... b)
		{
			for(boolean[] r : b) {
				for(boolean x : r)System.out.print(x?'#':'.');
				System.out.println();
			}
			System.out.println();
		}
		public static void main(String[] args) {
        TilingRectangle tilingRectangle = new TilingRectangle();
        
        int n = 2;
        int m = 3;
        
        int result = tilingRectangle.tilingRectangle(n, m);
        
        System.out.println("Minimum number of squares to tile a " + n + "x" + m + " rectangle: " + result);
    }
		
	}	
