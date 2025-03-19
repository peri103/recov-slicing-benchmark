import java.util.*;
class RotateTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        char[][] ans = new char[m][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                ans[j][i] = box[n-i-1][j];
            }
        }
        for (int j = 0; j < n; ++j) {
            int ns = m-1;
            for (int i = m-1; i >= 0; --i) {
                if (ans[i][j]=='*') {
                    ns = i-1;
                } else if (ans[i][j]=='#') {
                    ans[i][j] = '.';
                    ans[ns][j] = '#';
                    --ns;
                }
            }
        }
        return ans;
    }
      public static void main(String[] args) {
        RotateTheBox rotateTheBox = new RotateTheBox();
        
        char[][] box = {
            {'#', '.', '#'},
            {'#', '#', '*'},
            {'#', '.', '.'}
        };
        
        char[][] result = rotateTheBox.rotateTheBox(box);
        
        System.out.println("Rotated box:");
        for (char[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}