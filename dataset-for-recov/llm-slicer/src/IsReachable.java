	class IsReachable {
		public boolean isReachable(int targetX, int targetY) {
			while(targetX % 2 == 0){
				targetX /= 2;
			}
			while(targetY % 2 == 0){
				targetY /= 2;
			}
			return gcd(targetX, targetY) == 1;
		}

		public static int gcd(int a, int b) {
			while (b > 0) {
				int c = a;
				a = b;
				b = c % b;
			}
			return a;
		}
		public static void main(String[] args) {
        IsReachable isReachable = new IsReachable();
        int targetX = 6;
        int targetY = 9;
        boolean result = isReachable.isReachable(targetX, targetY);
        
        System.out.println("Is it possible to reach (" + targetX + ", " + targetY + ")? " + result);
    }

	}
