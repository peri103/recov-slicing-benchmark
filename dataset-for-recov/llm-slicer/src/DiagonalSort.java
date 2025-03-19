import java.util.*;

class DiagonalSort {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        HashMap<Integer, Integer> ind = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int d = i-j;
                if (!hm.containsKey(d))
                    hm.put(d, new ArrayList<>());
                hm.get(d).add(mat[i][j]);
                ind.put(d, hm.get(d).size()-1);
            }
        }
        for (int k : hm.keySet()) {
            Collections.sort(hm.get(k));
        }
        int[][] ans = new int[n][m];
        for (int i = n-1; i >= 0; --i) {
            for (int j = m-1; j >= 0; --j) {
                ans[i][j] = hm.get(i-j).get(ind.get(i-j));
                ind.put(i-j, ind.get(i-j)-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        DiagonalSort diagonalSort = new DiagonalSort();
        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] sortedMat = diagonalSort.diagonalSort(mat);
        System.out.println("Sorted Matrix Diagonally:");
        for (int i = 0; i < sortedMat.length; i++) {
            for (int j = 0; j < sortedMat[i].length; j++) {
                System.out.print(sortedMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}