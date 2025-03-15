import org.junit.jupiter.api.Test;

class _00008427Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        int[][] a = new int[2][];
        // Block 3:
        a[0] = new int[]{2};
        // Block 4:
        a[1] = new int[]{3};
        // Block 5:
        int ans = 0;
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            int tmp = a[0][0];
            // Block 8:
            int x = 0;
            // Block 9:
            int y = 0;
            // Block 10:
            for (int j = 0; j < n; j++) {
                // Block 11:
                if (i == j) {
                    // Block 12:
                    y += 1;
                }
                // Block 13:
                else {
                    // Block 14:
                    x += 1;
                }
                // Block 15:
                tmp += a[y][x];
            }
            // Block 16:
            ans = Math.max(tmp, ans);
        }
        // Block 17:
        System.out.println(ans);
        // Block END.
    }
    }

