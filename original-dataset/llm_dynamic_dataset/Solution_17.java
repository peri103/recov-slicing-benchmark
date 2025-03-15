import java.util.*;
class CountWays {

	public int countWays(int[][] ranges) {
		Arrays.sort(ranges, (int[] o,int[] p) -> o[0] - p[0]);
		int count = 1;
		for (int i = 0, j = -1; i < ranges.length; j = Math.max(j, ranges[i++][1])) {
			count = ranges[i][0] > j ? count * 2 % 1000000007 : count;
		}
		return count;
	}
	public static void main(String[] args) {
        int[][] ranges = { {1, 3}, {2, 4}, {6, 8} }; // Example input
        CountWays countWays = new CountWays();
        int result = countWays.countWays(ranges);
        System.out.println("Number of ways: " + result);
    }
}