	import java.util.*;
	
	class MaximumRobots {
		public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
			int n = chargeTimes.length;
			int p = 0;

			int[] c = new int[n];
			for(int i = 0;i < n;i++)c[i] = -chargeTimes[i];
			SegmentTreeRMQ st = new SegmentTreeRMQ(c);
			long[] cum = new long[n+1];
			for(int i = 0;i < n;i++){
				cum[i+1] = cum[i] + runningCosts[i];
			}
			int ans = 0;
			for(int i = 1;i <= n;i++){
				while(p < i) {
					long v = (cum[i] - cum[p]) * (i - p) - st.min(p, i);
					if(v > budget){
						p++;
					}else{
						break;
					}
				}
				ans = Math.max(ans, i-p);
			}
			return ans;
		}

		public static class SegmentTreeRMQ {
			public final int M, H, N;
			public int[] vals;
			public final int I = Integer.MAX_VALUE;

			public SegmentTreeRMQ(int n)
			{
				N = n;
				M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
				H = M>>>1;
				vals = new int[M];
				Arrays.fill(vals, 0, M, I);
			}

			public SegmentTreeRMQ(int[] a)
			{
				this(a.length);
				for(int i = 0;i < N;i++){
					vals[H+i] = a[i];
				}
				//		Arrays.fill(vals, H+N, M, I);
				for(int i = H-1;i >= 1;i--)propagate(i);
			}

			public void update(int pos, int x)
			{
				vals[H+pos] = x;
				for(int i = (H+pos)>>>1;i >= 1;i >>>= 1)propagate(i);
			}

			private void propagate(int i)
			{
				vals[i] = Math.min(vals[2*i], vals[2*i+1]);
			}

			public int min(int l, int r){
				int min = I;
				if(l >= r)return min;
				l += H; r += H;
				for(;l < r;l>>>=1,r>>>=1){
					if((l&1) == 1)min = Math.min(min, vals[l++]);
					if((r&1) == 1)min = Math.min(min, vals[--r]);
				}
				return min;
			}

			public int firstle(int l, int v) {
				if(l >= H)return -1;
				int cur = H+l;
				while(true){
					if(vals[cur] <= v){
						if(cur >= H)return cur-H;
						cur = 2*cur;
					}else{
						cur++;
						if((cur&cur-1) == 0)return -1;
						if((cur&1)==0)cur>>>=1;
					}
				}
			}

			public int lastle(int l, int v) {
				if(l < 0)return -1;
				int cur = H+l;
				while(true){
					if(vals[cur] <= v){
						if(cur >= H)return cur-H;
						cur = 2*cur + 1;
					}else{
						if((cur&cur-1) == 0)return -1;
						cur--;
						if((cur&1)==1)cur>>>=1;
					}
				}
			}
		}
		  public static void main(String[] args) {
        MaximumRobots maximumRobots = new MaximumRobots();
        
        int[] chargeTimes = {3, 6, 1, 3, 4};
        int[] runningCosts = {2, 1, 3, 4, 5};
        long budget = 25;
        
        int result = maximumRobots.maximumRobots(chargeTimes, runningCosts, budget);
        
        System.out.println("Maximum number of robots: " + result);
    }


	}
