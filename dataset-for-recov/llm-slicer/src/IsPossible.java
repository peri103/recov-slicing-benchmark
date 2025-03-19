	import java.util.*;
	class IsPossible {
	    public boolean isPossible(int[] target) {
	    	PriorityQueue<Integer> pq = new PriorityQueue<>();
	    	for(int v : target){
	    		pq.add(-v);
	    	}
	    	long sum = 0;
	    	for(int v : target){
	    		sum += v;
	    	}
	    	while(true){
	    		int cur = -pq.poll();
	    		if(cur == 1)break;
	    		if(cur-(sum-cur) > 0 && cur-(sum-cur) < cur){
	    			int an = (int)(cur-(sum-cur));
	    			sum -= cur - an;
	    			cur = an;
	    			pq.add(-cur);
	    		}else{
	    			return false;
	    		}
	    	}
	    	return true;
	    }
		public static void main(String[] args) {
        IsPossible isPossible = new IsPossible();
        int[] target = {9, 3, 5};
        boolean result = isPossible.isPossible(target);
        
        System.out.println("Is it possible to construct the target array? " + result);
    }
	}	
