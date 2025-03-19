import java.util.*;

public class FindDiagonalOrder {

	public int[] findDiagonalOrder(int[][] matrix) {
		
		int i , n = matrix.length;
		if (n == 0)
			return new int[] { };
		else {
			
			List<Integer> list = new ArrayList<Integer>();
			int m = matrix[0].length , x = 0 , y = 0 , cnt = 0;
			boolean rightUp = true;
			while (cnt < n * m) {
		
				list.add(matrix[x][y]);
				if (rightUp) {
					if (x - 1 >= 0 && y + 1 < m) {
						x --;
						y ++;
					} else {
						y ++;
						if (y >= m) {
							y = m - 1;
							x ++;
						}
						rightUp = false;
					}
				} else {
					if (x + 1 < n && y - 1 >= 0) {
						x ++;
						y --;
					} else {
						x ++;
						if (x >= n) {
							x = n - 1;
							y ++;
						}
						rightUp = true;
					}
				}
				
				cnt ++;
			}
			
			int[] ans = new int[list.size()];
			for (i = 0;i < list.size();i ++)
				ans[i] = list.get(i);
			return ans;
			
		}
        
    }
	public static void main(String[] args) {
		FindDiagonalOrder solution = new FindDiagonalOrder();
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		int[] result = solution.findDiagonalOrder(matrix);
		System.out.println("Diagonal Order: " + Arrays.toString(result));
}

}