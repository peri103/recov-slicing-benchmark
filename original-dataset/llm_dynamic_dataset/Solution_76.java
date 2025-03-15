	import java.util.*;
	class MinimumMoves {
	    public int minimumMoves(int[][] g) {
	        int n = g.length, m = g[0].length;
	        Queue<int[]> q = new ArrayDeque<>();
	        q.add(new int[]{0, 0, 0});
	        int[][][] d = new int[2][n][m];
	        for(int i = 0;i < 2;i++){
	        	for(int j = 0;j < n;j++){
	        		Arrays.fill(d[i][j], 99999999);
	        	}
	        }
	        d[0][0][0] = 0;
	        while(!q.isEmpty()){
	        	int[] cur = q.poll();
	        	int st = cur[0], r = cur[1], c = cur[2];
	        	int ur = r + (st == 1 ? 1 : 0), uc = c + (st == 1 ? 0 : 1);
	        	if(r == n-1 && c == n-2 && st == 0){
	        		return d[st][r][c];
	        	}
	        	// r
	        	if(uc+1 < m && g[r][c+1] == 0 && g[ur][uc+1] == 0 &&
	        			d[st][r][c+1] > d[st][r][c] + 1){
	        		d[st][r][c+1] = d[st][r][c] + 1;
	        		q.add(new int[]{st, r, c+1});
	        	}
	        	// d
	        	if(ur+1 < n && g[r+1][c] == 0 && g[ur+1][uc] == 0 &&
	        			d[st][r+1][c] > d[st][r][c] + 1){
	        		d[st][r+1][c] = d[st][r][c] + 1;
	        		q.add(new int[]{st, r+1, c});
	        	}
	        	int xr = r + (st == 0 ? 1 : 0), xc = c + (st == 0 ? 0 : 1);
	        	if(xr < n && xc < m && g[xr][xc] == 0 && g[r+1][c+1] == 0 && 
	        			d[st^1][r][c] > d[st][r][c] + 1){
	        		d[st^1][r][c] = d[st][r][c] + 1;
	        		q.add(new int[]{st^1, r, c});
	        	}
	        }
	        return -1;
	    }
		 public static void main(String[] args) {
        MinimumMoves minimumMoves = new MinimumMoves();
        
        int[][] grid = {
            {0, 0, 0, 0, 0, 1},
            {1, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 1},
            {0, 0, 1, 0, 1, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0}
        };
        
        int result = minimumMoves.minimumMoves(grid);
        
        System.out.println("Minimum moves: " + result);
    }
		
	}	
