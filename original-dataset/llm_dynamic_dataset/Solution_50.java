	class MakeStringSorted {
		public int makeStringSorted(String s) {
			int n = s.length();
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = s.charAt(i)-'a';
			}
			int[] f = new int[26];
			for(int v : a)f[v]++;

			final int mod = 1000000007;

			int[][] fif = enumFIF(5000, mod);
			long ret = 0;
			for(int i = 0;i < n;i++){
				for(int j = 0;j < a[i];j++){
					if(f[j] == 0)continue;
					f[j]--;
					long num = 1;
					int su = 0;
					for(int k = 0;k < 26;k++){
						su += f[k];
						num = num * C(su, f[k], mod, fif) % mod;
					}
					ret += num;
					f[j]++;
				}
				f[a[i]]--;
			}
			return (int)(ret%mod);
		}

		public long C(int n, int r, int mod, int[][] fif) {
			if (n < 0 || r < 0 || r > n) return 0;
			return (long) fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod;
		}


		public int[][] enumFIF(int n, int mod) {
			int[] f = new int[n + 1];
			int[] invf = new int[n + 1];
			f[0] = 1;
			for (int i = 1; i <= n; i++) {
				f[i] = (int) ((long) f[i - 1] * i % mod);
			}
			long a = f[n];
			long b = mod;
			long p = 1, q = 0;
			while (b > 0) {
				long c = a / b;
				long d;
				d = a;
				a = b;
				b = d % b;
				d = p;
				p = q;
				q = d - c * q;
			}
			invf[n] = (int) (p < 0 ? p + mod : p);
			for (int i = n - 1; i >= 0; i--) {
				invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
			}
			return new int[][]{f, invf};
		}
		public static void main(String[] args) {
        MakeStringSorted makeStringSorted = new MakeStringSorted();
        
        String s = "cba";
        
        int result = makeStringSorted.makeStringSorted(s);
        
        System.out.println("Number of steps to make the string sorted: " + result);
    }

	}
