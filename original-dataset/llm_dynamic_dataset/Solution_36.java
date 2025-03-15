	import java.util.*;
	
	class HighestPeak {
		public int[][] highestPeak(int[][] isWater) {
			int n= isWater.length, m = isWater[0].length;
			Queue<int[]> q = new ArrayDeque<>();
			int[][] h = new int[n][m];
			for(int i = 0;i < n;i++)Arrays.fill(h[i], 999999);
			for(int i = 0;i < n;i++){
				for(int j = 0;j < m;j++){
					if(isWater[i][j] == 1){
						h[i][j] = 0;
						q.add(new int[]{i, j});
					}
				}
			}
			int[] dr = {1, 0, -1, 0};
			int[] dc = {0, 1, 0, -1};

			while(!q.isEmpty()){
				int[] cur = q.poll();
				int r = cur[0], c = cur[1];
				for(int k = 0;k < 4;k++){
					int nr = r + dr[k], nc = c + dc[k];
					if(nr >= 0 && nr < n && nc >= 0 && nc < m &&
					h[nr][nc] > h[r][c] + 1){
						h[nr][nc] = h[r][c] + 1;
						q.add(new int[]{nr, nc});
					}
				}
			}
			return h;
		}
	public static void main(String[] args) {
        HighestPeak highestPeak = new HighestPeak();
        int[][] isWater = {
            {0, 1},
            {0, 0}
        };
        int[][] result = highestPeak.highestPeak(isWater);

        System.out.println("Highest Peak Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
	}
