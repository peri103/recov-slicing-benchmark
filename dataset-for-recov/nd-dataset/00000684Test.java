import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int ans = -1;
        // Block 3:
        int prev = 0;
        // Block 4:
        for (int i = 1; i <= k; i++) {
            // Block 5:
            prev = (10 * prev + 7) % k;
            // Block 6:
            if (prev == 0) {
                // Block 7:
                ans = i;
                // Block 8:
                break;
            }
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
    }

