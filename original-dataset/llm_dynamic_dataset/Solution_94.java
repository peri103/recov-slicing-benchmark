	import java.util.*;
	
	class ShortestPathBinaryMatrix {
	    public int shortestPathBinaryMatrix(int[][] a) {
	        int n = a.length;
	        if(a[0][0] == 1 || a[n-1][n-1] == 1)return -1;
	        int[][] d = new int[n][n];
	        for(int i = 0;i < n;i++){
	        	Arrays.fill(d[i], 999999999);
	        }
	        d[0][0] = 0;
	        Queue<int[]> q = new ArrayDeque<>();
	        q.add(new int[]{0, 0});
	        while(!q.isEmpty()){
	        	int[] cur = q.poll();
	        	int r = cur[0], c = cur[1];
	        	for(int k = -1;k <= 1;k++){
	        		for(int l = -1;l <= 1;l++){
	        			int nr = r + k, nc = c + l;
	        			if(nr >= 0 && nr < n && nc >= 0 && nc < n && a[nr][nc] == 0 && d[nr][nc] > d[r][c] + 1){
	        				d[nr][nc] = d[r][c] + 1;
	        				q.add(new int[]{nr, nc});
	        			}
	        		}
	        	}
	        }
	        if(d[n-1][n-1] > 99999)return -1;
	        return d[n-1][n-1]+1;
	    }
		public static void main(String[] args) {
        ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();
        
        int[][] grid = {
            {0, 1},
            {1, 0}
        };
        
        int result = shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid);
        
        System.out.println("Shortest path length in binary matrix: " + result);
    }
	}	
