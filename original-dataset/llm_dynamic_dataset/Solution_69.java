	class MinNonZeroProduct {
		public int minNonZeroProduct(int p) {
			// 0001111
			// 0110011
			// 1010101

			// 0001111
			// 0001111
			// 1110001

			final int mod = 1000000007;
			if(p == 1){
				return 1;
			}else if(p == 2){
				return 6;
			}
			return (int)(pow((1L<<p)-2, (1L<<p-1)-1, mod) * (((1L<<p)-1)%mod) % mod);
		}

		public long pow(long a, long n, long mod) {
					a %= mod;
			long ret = 1;
			int x = 63 - Long.numberOfLeadingZeros(n);
			for (; x >= 0; x--) {
				ret = ret * ret % mod;
				if (n << 63 - x < 0) ret = ret * a % mod;
			}
			return ret;
		}
		    public static void main(String[] args) {
        MinNonZeroProduct minNonZeroProduct = new MinNonZeroProduct();
        
        int p = 3;
        
        int result = minNonZeroProduct.minNonZeroProduct(p);
        
        System.out.println("Minimum non-zero product for p=" + p + ": " + result);
    }

	}
