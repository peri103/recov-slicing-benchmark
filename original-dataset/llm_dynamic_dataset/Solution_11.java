	class ConstructArray {
	    public int[] constructArray(int n, int k) {
	    	int[] a = new int[n];
	    	int l = 1, h = n;
	    	int p = 0;
	        for(int i = 0;i < k-1;i++){
	        	if(i % 2 == 0){
	        		a[p++] = l++;
	        	}else{
	        		a[p++] = h--;
	        	}
	        }
	        if(k % 2 == 1){
		        for(int i = l;i <= h;i++){
		        	a[p++] = i;
		        }
	        }else{
		        for(int i = h;i >= l;i--){
		        	a[p++] = i;
		        }
	        }
	        return a;
	    }
		public static void main(String[] args) {
			int n = 10; // Example value for n
			int k = 4;  // Example value for k
			ConstructArray constructArray = new ConstructArray();
			int[] result = constructArray.constructArray(n, k);
			System.out.print("Constructed array: ");
			for (int num : result) {
				System.out.print(num + " ");
			}
			System.out.println();
    }
	}
