import java.util.*;
	class LatestDayToCross {
		public int latestDayToCross(int n, int m, int[][] cells) {
			int low = 0, high = n*m+1;
			while(high - low > 1){
				int h = high+low>>1;
				boolean[][] wa = new boolean[n][m];
				for(int i = 0;i < h;i++){
					wa[cells[i][0]-1][cells[i][1]-1] = true;
				}
				DJSet ds = new DJSet(n*m+2);
				for(int i = 0;i < n;i++){
					for(int j = 0;j < m;j++){
						if(i+1 < n && !wa[i][j] && !wa[i+1][j]){
							ds.union(i*m+j, (i+1)*m+j);
						}
						if(j+1 < m && !wa[i][j] && !wa[i][j+1]){
							ds.union(i*m+j, i*m+j+1);
						}
					}
				}
				for(int j = 0;j < m;j++){
					if(!wa[0][j])ds.union(n*m, 0*m+j);
					if(!wa[n-1][j])ds.union(n*m+1, (n-1)*m+j);
				}
				if(ds.equiv(n*m, n*m+1)){
					low = h;
				}else{
					high = h;
				}
			}
			return low;
		}

		public class DJSet {
			public int[] upper;

			public DJSet(int n) {
				upper = new int[n];
				Arrays.fill(upper, -1);
			}

			public int root(int x) {
				return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
			}

			public boolean equiv(int x, int y) {
				return root(x) == root(y);
			}

			public boolean union(int x, int y) {
				x = root(x);
				y = root(y);
				if (x != y) {
					if (upper[y] < upper[x]) {
						int d = x;
						x = y;
						y = d;
					}
					upper[x] += upper[y];
					upper[y] = x;
				}
				return x == y;
			}

			public int count() {
				int ct = 0;
				for (int u : upper) if (u < 0) ct++;
				return ct;
			}

			public int[][] toBucket() {
				int n = upper.length;
				int[][] ret = new int[n][];
				int[] rp = new int[n];
				for (int i = 0; i < n; i++) if (upper[i] < 0) ret[i] = new int[-upper[i]];
				for (int i = 0; i < n; i++) {
					int r = root(i);
					ret[r][rp[r]++] = i;
				}
				return ret;
			}
		}
		public static void main(String[] args) {
        LatestDayToCross latestDayToCross = new LatestDayToCross();
        int n = 3;
        int m = 3;
        int[][] cells = {
            {1, 2},
            {2, 1},
            {3, 3},
            {2, 2},
            {1, 1},
            {1, 3},
            {2, 3},
            {3, 1},
            {3, 2}
        };

        int result = latestDayToCross.latestDayToCross(n, m, cells);
        System.out.println("Latest day to cross: " + result);
    }

		

	}
