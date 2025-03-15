import java.util.*;

class AssignBikes {

	private static class Position {
		public int x , y;
		public Position(int x , int y) {
			this.x = x;
			this.y = y;			
		}
	}
	
	private int ans = - 1;	
	private boolean[] vis = new boolean[20];
	
    public int assignBikes(int[][] workers, int[][] bikes) {
    	List<Position> list1 = new ArrayList<>();
    	List<Position> list2 = new ArrayList<>();
    	for (int[] pos : workers) {
    		list1.add(new Position(pos[0] , pos[1]));    		
    	}
    	for (int[] pos : bikes) {
    		list2.add(new Position(pos[0] , pos[1]));
    	}
    	backtracking(list1 , 0 , list2 , 0);    	
    	return ans;
    }    
    
    private int getDist(Position pos1 , Position pos2) {
    	return Math.abs(pos1.x - pos2.x) + Math.abs(pos1.y - pos2.y);
    }
    
    private void backtracking(List<Position> list1 , int current , List<Position> list2 , int dist) {
    	if (current == list1.size()) {
    		if (dist < ans || ans < 0) {
    			ans = dist;    			
    		}    		
    	} else {
    		for (int i = 0;i < list2.size();i ++) {
    			if (!vis[i]) {
    				vis[i] = true;
    				backtracking(list1 , current + 1 , list2 , dist + getDist(list1.get(current) , list2.get(i)));
    				vis[i] = false;
    			}
    		}
    	}    	
    }

	public static void main(String[] args) {
        int[][] workers = {{0, 0}, {2, 1}};
        int[][] bikes = {{1, 2}, {3, 3}};

        AssignBikes assignBikes = new AssignBikes();
        int result = assignBikes.assignBikes(workers, bikes);

        System.out.println("Minimum Distance: " + result);
    }
    
}