	class CanTransform {
	    public boolean canTransform(String start, String end) {
	    	if(!start.replace("X", "").equals(end.replace("X", "")))return false;
	    	int n = start.length();
	    	int p = 0;
	    	for(int i = 0;i < n;i++){
	    		if(start.charAt(i) != 'X'){
	    			while(p < n && end.charAt(p) == 'X'){
	    				p++;
	    			}
	    			if(start.charAt(i) == 'R'){
	    				if(i > p)return false;
	    			}else{
	    				if(i < p)return false;
	    			}
	    			p++;
	    		}
	    	}
	    	return true;
	    }
		public static void main(String[] args) {
			String start = "RXXLRXRXL";
			String end = "XRLXXRRLX";
			
			CanTransform canTransformInstance = new CanTransform();
			boolean result = canTransformInstance.canTransform(start, end);
			
			System.out.println("Can transform: " + result);
    }
	}	
