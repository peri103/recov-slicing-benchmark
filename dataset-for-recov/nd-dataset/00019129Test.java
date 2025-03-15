import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        if ((n & 1) != 0) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int ans = 0;
            // Block 6:
            int x = 10;
            // Block 7:
            while (n >= x) {
                // Block 8:
                ans += n / x;
                // Block 9:
                x *= 5;
            }
            // Block 10:
            System.out.println(ans);
        }
        // Block END.
    }
    }

