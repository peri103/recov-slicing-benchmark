import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int ans = 0;
            // Block 6:
            while (n >= 5) {
                // Block 7:
                ans += (n / 5) / 2;
                // Block 8:
                n /= 5;
            }
            // Block 9:
            System.out.println(ans);
        }
        // Block END.
    }
    }

