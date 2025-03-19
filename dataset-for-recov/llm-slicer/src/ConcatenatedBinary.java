	class ConcatenatedBinary {
		public int concatenatedBinary(int n) {
			int t = 2;
			final int mod = 1000000007;
			long ret = 0;
			for(int i = 1;i <= n;i++){
				if(i == t){
					t *= 2;
				}
				ret = ret * t + i;
				ret %= mod;
			}
			return (int)ret;
		}
		public static void main(String[] args) {
			int n = 12; // Example input
			ConcatenatedBinary concatenatedBinary = new ConcatenatedBinary();
			int result = concatenatedBinary.concatenatedBinary(n);
			System.out.println("Concatenated Binary result for n = " + n + " is: " + result);
   	 }
	}
