import org.junit.jupiter.api.Test;

class _00013839Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a_li = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        if (n < 3) {
            // Block 4:
            System.out.println(1);
            // Block 5:
            System.exit(0);
        }
        // Block 6:
        int ans = 1;
        // Block 7:
        String flag = "flat";
        // Block 8:
        for (int i = 1; i < n; i++) {
            // Block 9:
            if (a_li[i - 1] > a_li[i]) {
                // Block 10:
                if (flag.equals("up")) {
                    // Block 11:
                    ans += 1;
                    // Block 12:
                    flag = "flat";
                    // Block 13:
                    continue;
                }
                // Block 14:
                flag = "down";
            }
            // Block 15:
            else if (a_li[i - 1] < a_li[i]) {
                // Block 16:
                if (flag.equals("down")) {
                    // Block 17:
                    ans += 1;
                    // Block 18:
                    flag = "flat";
                    // Block 19:
                    continue;
                }
                // Block 20:
                flag = "up";
            }
            // Block 21:
            else {
                // Block 22:
                if (flag.equals("flat")) {
                    // Block 23:
                    flag = "flat";
                }
            }
        }
        // Block 24:
        System.out.println(ans);
        // Block END.
    }
    }

