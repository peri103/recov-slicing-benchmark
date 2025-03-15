import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        int ans = 1;
        // Block 4:
        String flag = "Init";
        // Block 5:
        for (int i = 1; i < n; i++) {
            // Block 6:
            if (flag.equals("Init")) {
                // Block 7:
                if (a[i - 1] == a[i]) {
                    // Block 8:
                    continue;
                }
                // Block 9:
                else if (a[i - 1] > a[i]) {
                    // Block 10:
                    flag = "-";
                }
                // Block 11:
                else {
                    // Block 12:
                    flag = "+";
                }
            }
            // Block 13:
            else if (flag.equals("-")) {
                // Block 14:
                if (a[i - 1] < a[i]) {
                    // Block 15:
                    ans += 1;
                    // Block 16:
                    flag = "Init";
                }
            }
            // Block 17:
            else {
                // Block 18:
                if (a[i - 1] > a[i]) {
                    // Block 19:
                    ans += 1;
                    // Block 20:
                    flag = "Init";
                }
            }
        }
        // Block 21:
        System.out.println(ans);
        // Block END.
    }
    }

