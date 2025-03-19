	import java.util.*;
	
	class MaxPerformance {
	    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
	        int[][] se = new int[n][];
	        for(int i = 0;i < n;i++){
	        	se[i] = new int[]{speed[i], efficiency[i]};
	        }
	        int mod = 1000000007;
	        Arrays.sort(se, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					return -(a[1] - b[1]);
				}
			});
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        long s = 0;
	        long max = 0;
	        for(int i = 0;i < n;i++){
	        	pq.add(se[i][0]);
	        	s += se[i][0];
	        	if(pq.size() > k){
	        		s -= pq.poll();
	        	}
	        	max = Math.max(max, s*se[i][1]);
	        }
	        return (int)(max % mod);
	    }
		 public static void main(String[] args) {
        MaxPerformance maxPerformance = new MaxPerformance();
        
        int n = 6;
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        int k = 3;
        
        int result = maxPerformance.maxPerformance(n, speed, efficiency, k);
        
        System.out.println("Maximum performance: " + result);
    }
	}	
