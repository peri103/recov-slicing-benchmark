public class CycleLengthQueries {

	public int[] cycleLengthQueries(int n, int[][] queries) {
		int[] result = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			String s = Integer.toBinaryString(queries[i][0]), t = Integer.toBinaryString(queries[i][1]);
			result[i] = s.length() + t.length() + 1;
			for (int j = 0, k = 0; j < s.length() && k < t.length() && s.charAt(j) == t.charAt(k); j++, k++) {
				result[i] -= 2;
			}
		}
		return result;
	}
	public static void main(String[] args) {
        int n = 5; // Example value for n
        int[][] queries = { {3, 5}, {1, 7}, {2, 6} }; // Example queries
        CycleLengthQueries cycleLengthQueries = new CycleLengthQueries();
        int[] result = cycleLengthQueries.cycleLengthQueries(n, queries);
    }
}