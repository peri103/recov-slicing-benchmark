import java.util.*;
	class TallestBillboard {
	    public int tallestBillboard(int[] rods) {
	    	int n = rods.length;
	    	int h = n/2;
	    	int o = 10002;
	    	int[] ls = new int[20005];
	    	Arrays.fill(ls, -99999999);
	    	for(int i = 0;i < (int)Math.pow(3, h);i++){
	    		int s = 0;
	    		int as = 0;
	    		int v = i;
	    		for(int j = 0;j < h;j++){
	    			int w = v % 3;
	    			if(w == 1){
	    			}else if(w == 0){
	    				s += rods[j];
	    				as += rods[j];
	    			}else{
	    				s -= rods[j];
	    				as += rods[j];
	    			}
	    			v /= 3;
	    		}
	    		ls[s+o] = Math.max(ls[s+o], as);
	    	}
	    	int ret = 0;
	    	for(int i = 0;i < (int)Math.pow(3, n-h);i++){
	    		int s = 0;
	    		int as = 0;
	    		int v = i;
	    		for(int j = 0;j < n-h;j++){
	    			int w = v % 3;
	    			if(w == 1){
	    			}else if(w == 0){
	    				s += rods[j+h];
	    				as += rods[j+h];
	    			}else{
	    				s -= rods[j+h];
	    				as += rods[j+h];
	    			}
	    			v /= 3;
	    		}
	    		ret = Math.max(ret, (ls[o-s] + as) / 2);
	    	}
	    	return ret;
	    }
		public static void main(String[] args) {
        TallestBillboard tallestBillboard = new TallestBillboard();
        
        int[] rods = {1, 2, 3, 6};
        
        int result = tallestBillboard.tallestBillboard(rods);
        
        System.out.println("Tallest possible height of the billboard: " + result);
    }
	}	
