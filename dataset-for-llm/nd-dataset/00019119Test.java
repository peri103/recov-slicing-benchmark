import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int ans = 0;
        // Block 3:
        if (n % 2 == 0) {
            // Block 4:
            for (int i = 1; i < 10000; i++) {
                // Block 5:
                long waru = 2 * Math.pow(5, i);
                // Block 6:
                if (n < waru) {
                    // Block 7:
                    break;
                }
                // Block 8:
                else {
                    // Block 9:
                    int tmp = n / (int) waru;
                    // Block 10:
                    ans += tmp;
                }
            }
        }
        // Block 11:
        System.out.println(String.valueOf(ans));
        // Block END.
    }
    }
}
