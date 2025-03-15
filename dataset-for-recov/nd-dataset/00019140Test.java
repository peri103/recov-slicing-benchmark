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
            int cnt = 0;
            // Block 6:
            n /= 2;
            // Block 7:
            while (n != 0) {
                // Block 8:
                n /= 5;
                // Block 9:
                cnt += n;
            }
            // Block 10:
            System.out.println(cnt);
        }
        // Block END.
    }
    }

