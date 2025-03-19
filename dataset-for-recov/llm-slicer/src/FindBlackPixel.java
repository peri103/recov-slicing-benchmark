import java.util.*;

public class FindBlackPixel {
    public int findBlackPixel(char[][] picture, int N) {
        int m=picture.length; if (m==0) return 0;
        int n=picture[0].length;
        String[] rowStrings=new String[m];
        for (int i=0;i<m;i++) rowStrings[i]=new String(picture[i]);
        int[] row=new int[m];
        HashSet<Integer>[] col=new HashSet[n];
        for (int i=0;i<n;i++) col[i]=new HashSet<>();
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (picture[i][j]=='B') {
                    row[i]++;
                    col[j].add(i);
                }
            }
        }
        int cnt=0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (picture[i][j]=='B' && row[i]==N && col[j].size()==N) {
                    boolean able=true;
                    for (int id: col[j]) {
                        if (!rowStrings[id].equals(rowStrings[i])) {
                            able=false;break;
                        }
                    }
                    if (able) cnt++;
                }
            }
        }
        return cnt;
    }
     public static void main(String[] args) {
        FindBlackPixel findBlackPixel = new FindBlackPixel();
        char[][] picture = {
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'W', 'B', 'W', 'B', 'W'}
        };
        int N = 3;
        int result = findBlackPixel.findBlackPixel(picture, N);
        System.out.println("Number of black pixels: " + result);
    }
}