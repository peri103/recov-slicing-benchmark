import java.util.*;

class MatrixSumQueries {

	public long matrixSumQueries(int n, int[][] queries) {
		HashSet<Integer> row = new HashSet<>(), col = new HashSet<>();
		long sum = 0;
		for (int i = queries.length - 1; i >= 0; i--) {
			sum += !(queries[i][0] == 0 ? row : col).add(queries[i][1]) ? 0
					: queries[i][2] * (n - (queries[i][0] == 0 ? col : row).size());
		}
		return sum;
	}
	 public static void main(String[] args) {
        MatrixSumQueries matrixSumQueries = new MatrixSumQueries();
        
        int n = 3;
        int[][] queries = {
            {0, 0, 5},
            {1, 1, 7},
            {0, 2, -3},
            {1, 0, 2}
        };
        
        long result = matrixSumQueries.matrixSumQueries(n, queries);
        
        System.out.println("Matrix sum after queries: " + result);
    }
}