	import java.util.*;
	
	class MaxDistance {
	    public int maxDistance(int[][] a) {
	        int n = a.length, m = a[0].length;
	        int[][] d = new int[n][m];
	        Queue<int[]> q = new ArrayDeque<>();
	        for(int i = 0;i < n;i++){
	        	for(int j = 0;j < m;j++){
	        		d[i][j] = a[i][j] == 1 ? 0 : 99999999;
	        		if(d[i][j] == 0)q.add(new int[]{i, j});
	        	}
	        }
	        
	        int[] dr = { 1, 0, -1, 0 };
			int[] dc = { 0, 1, 0, -1 };
	        while(!q.isEmpty()){
	        	int[] cur = q.poll();
	        	int r = cur[0], c = cur[1];
	        	for(int k = 0;k < 4;k++){
	        		int nr = r + dr[k], nc = c + dc[k];
	        		if(nr >= 0 && nr < n && nc >= 0 && nc < m && d[nr][nc] > d[r][c] + 1){
	        			d[nr][nc] = d[r][c] + 1;
	        			q.add(new int[]{nr, nc});
	        		}
	        	}
	        }
	        
	        int max = 0;
	        for(int i = 0;i < n;i++){
	        	for(int j = 0;j < m;j++){
	        		max = Math.max(max, d[i][j]);
	        	}
	        }
	        if(max == 99999999 || max == 0)max = -1;
	        return max;
	    }
		public static void main(String[] args) {
        MaxDistance maxDistance = new MaxDistance();
        
        int[][] grid = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        };
        
        int result = maxDistance.maxDistance(grid);
        
        System.out.println("Maximum distance from land to water: " + result);
    }
	}	
