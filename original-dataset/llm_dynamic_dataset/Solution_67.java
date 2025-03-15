import java.util.*;
class MinJumps {
	
	// has tried same value	
	private Set<Integer> set = new HashSet<>();
	private Map<Integer , List<Integer>> map = new HashMap<>();
	private int[] dist;
	
    public int minJumps(int[] arr) {
    	int i , j , n = arr.length;
    	for (i = 0;i < n;i ++) {
    		map.putIfAbsent(arr[i] , new ArrayList<>());
    		map.get(arr[i]).add(i);    		
    	}
    	dist = new int[n];
    	Arrays.fill(dist , - 1);
    	dist[0] = 0;
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(0);
    	while (!queue.isEmpty()) {
    		int current = queue.poll();
    		if (current == n - 1) {
    			return dist[current];    			
    		}
    		// + 1
    		if (current + 1 < n && dist[current + 1] < 0) {
    			dist[current + 1] = dist[current] + 1;
    			queue.add(current + 1);
    		}
    		// - 1
    		if (current - 1 >= 0 && dist[current - 1] < 0) {
    			dist[current - 1] = dist[current] + 1;
    			queue.add(current - 1);
    		}
    		// same    		
    		if (!set.contains(arr[current])) {
    			set.add(arr[current]);
    			for (int index : map.get(arr[current])) {
    				if (dist[index] < 0) {
    					dist[index] = dist[current] + 1;
    					queue.add(index);    					
    				}
    			}
    		}
    	}
    	return - 1;
    }
	  public static void main(String[] args) {
        MinJumps minJumps = new MinJumps();
        
        int[] arr = {100,-23,100,100,3,2,1,100};
        
        int result = minJumps.minJumps(arr);
        
        System.out.println("Minimum jumps needed: " + result);
    }
}