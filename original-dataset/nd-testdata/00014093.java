import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] A = {1, 2, 3, 2, 2, 1};
        // Block 3:
        ArrayList<Integer> B = new ArrayList<>();
        // Block 4:
        for (int a : A) {
            // Block 5:
            if (!B.isEmpty()) {
                // Block 6:
                if (B.get(B.size() - 1).equals(a)) {
                    // Block 7:
                    continue;
                }
                // Block 8:
                else {
                    // Block 9:
                    B.add(a);
                }
            }
            // Block 10:
            else {
                // Block 11:
                B.add(a);
            }
        }
        // Block 12:
        int m = B.size();
        // Block 13:
        ArrayList<Integer> X = new ArrayList<>();
        // Block 14:
        for (int i = 0; i < m; i++) {
            // Block 15:
            if (i == 0) {
                // Block 16:
                int cur = B.get(0);
                // Block 17:
                int cnt = 1;
                // Block 18:
                int flag = 0;
                // Block 19:
            } else {
                // Block 20:
                if (flag == 0) {
                    // Block 21:
                    if (B.get(i) > cur) {
                        // Block 22:
                        flag = 1;
                        // Block 23:
                        cnt++;
                        // Block 24:
                        cur = B.get(i);
                    }
                    // Block 25:
                    if (B.get(i) < cur) {
                        // Block 26:
                        flag = -1;
                        // Block 27:
                        cnt++;
                        // Block 28:
                        cur = B.get(i);
                    }
                }
                // Block 29:
                else if (flag == 1) {
                    // Block 30:
                    if (B.get(i) > cur) {
                        // Block 31:
                        cnt++;
                        // Block 32:
                        cur = B.get(i);
                    }
                    // Block 33:
                    else {
                        // Block 34:
                        X.add(cnt);
                        // Block 35:
                        cur = B.get(i);
                        // Block 36:
                        cnt = 1;
                        // Block 37:
                        flag = 0;
                    }
                }
                // Block 38:
                else {
                    // Block 39:
                    if (B.get(i) < cur) {
                        // Block 40:
                        cnt++;
                        // Block 41:
                        cur = B.get(i);
                    }
                    // Block 42:
                    else {
                        // Block 43:
                        X.add(cnt);
                        // Block 44:
                        cur = B.get(i);
                        // Block 45:
                        cnt = 1;
                        // Block 46:
                        flag = 0;
                    }
                }
            }
        }
        // Block 47:
        else {
            // Block 48:
            X.add(cnt);
        }
        // Block 49:
        System.out.println(X.size());
        // Block END.
    }
}
