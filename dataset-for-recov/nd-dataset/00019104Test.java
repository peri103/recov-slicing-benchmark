import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int ans = 0;
        // Block 3:
        if (N % 2 != 0) {
            // Block 4:
            System.out.println(ans);
        } else {
            // Block 5:
            int i = 1;
            // Block 6:
            while (true) {
                // Block 7:
                int tmp = (int) (Math.pow(5, i) * 2);
                // Block 8:
                if (tmp <= N) {
                    // Block 9:
                    ans += N / tmp;
                    // Block 10:
                    i += 1;
                // Block 11:
                } else {
                    // Block 12:
                    break;
                }
            }
            // Block 13:
            System.out.println(ans);
        }
        // Block END.
    }
    }

