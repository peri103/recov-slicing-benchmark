import java.util.*;

	class GroupStrings {
		public int[] groupStrings(String[] words) {
			int n = words.length;
			int[] a = new int[n];
			DJSet ds = new DJSet(n);
			Map<Integer, Integer> map = new HashMap<>();
			for(int i = 0;i < n;i++){
				for(char c : words[i].toCharArray()){
					a[i] |= 1<<c-'a';
				}
				if(map.containsKey(a[i])){
					ds.union(i, map.get(a[i]));
				}

				map.put(a[i], i);
			}

			for(int i = 0;i < n;i++){
				for(int j = 0;j < 26;j++){
					int k = a[i]^1<<j;
					if(map.containsKey(k)){
						ds.union(i, map.get(k));
					}
				}
				for(int j = 0;j < 26;j++){
					for(int l = 0;l < 26;l++){
						if(a[i]<<~j<0 && a[i]<<~l>=0){
							int k = a[i]^1<<j^1<<l;
							if(map.containsKey(k)){
								ds.union(i, map.get(k));
							}
						}
					}
				}
			}

			int min = 0;
			for(int i = 0;i < n;i++){
				min = Math.min(min, ds.upper[i]);
			}
			int[] ans = new int[]{ds.count(), -min};
			return ans;
		}

		public class DJSet {
			public int[] upper;

			public DJSet(int n) {
				upper = new int[n];
				Arrays.fill(upper, -1);
			}

			public int root(int x) {
				return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
			}

			public boolean equiv(int x, int y) {
				return root(x) == root(y);
			}

			public boolean union(int x, int y) {
				x = root(x);
				y = root(y);
				if (x != y) {
					if (upper[y] < upper[x]) {
						int d = x;
						x = y;
						y = d;
					}
					upper[x] += upper[y];
					upper[y] = x;
				}
				return x == y;
			}

			public int count() {
				int ct = 0;
				for (int u : upper) if (u < 0) ct++;
				return ct;
			}

			public int[][] toBucket() {
				int n = upper.length;
				int[][] ret = new int[n][];
				int[] rp = new int[n];
				for (int i = 0; i < n; i++) if (upper[i] < 0) ret[i] = new int[-upper[i]];
				for (int i = 0; i < n; i++) {
					int r = root(i);
					ret[r][rp[r]++] = i;
				}
				return ret;
			}
		}
	public static void main(String[] args) {
			GroupStrings groupStrings = new GroupStrings();
			
			// Example input
			String[] words = {"abc", "bcd", "ace", "xyz", "az", "ba", "a", "z"};

			// Calling the groupStrings method and getting the result
			int[] result = groupStrings.groupStrings(words);

			// Printing the result
			System.out.println("Number of groups: " + result[0]);
			System.out.println("Size of the largest group: " + result[1]);
		}
	}
