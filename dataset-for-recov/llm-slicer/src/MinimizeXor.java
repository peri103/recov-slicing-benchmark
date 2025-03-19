	class MinimizeXor {
		public int minimizeXor(int num1, int num2) {
			int o = num1;
			int s = Integer.bitCount(num2);
			for(int d = 29;d >= 0 && s > 0;d--){
				if(num1<<~d<0){
					num1 ^= 1<<d;
					s--;
				}
			}
			for(int d = 0;d < 30 && s > 0;d++){
				if(o<<~d>=0){
					num1 ^= 1<<d;
					s--;
				}
			}
			return num1 ^ o;
		}
		  public static void main(String[] args) {
        MinimizeXor minimizeXor = new MinimizeXor();
        
        int num1 = 3;
        int num2 = 5;
        
        int result = minimizeXor.minimizeXor(num1, num2);
        
        System.out.println("Minimum XOR value: " + result);
    }
	}
