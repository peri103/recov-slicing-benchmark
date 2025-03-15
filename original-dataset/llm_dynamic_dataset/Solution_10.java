	import java.util.*;
	class ConnectSticks {
	    public int connectSticks(int[] sticks) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int v : sticks){
	        	pq.add(v);
	        }
	        int ans = 0;
	        while(pq.size() > 1){
	        	int x = pq.poll();
	        	int y = pq.poll();
	        	ans += x + y;
	        	pq.add(x+y);
	        }
	        return ans;
	    }
		public static void main(String[] args) {
			int[] sticks = {2, 4, 3}; // Example input
			ConnectSticks connectSticks = new ConnectSticks();
			int result = connectSticks.connectSticks(sticks);
			System.out.println("Minimum cost to connect sticks: " + result);
   	 }
	}	
