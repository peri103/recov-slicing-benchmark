import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        if (N % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int ans = 0;
            // Block 6:
            int judge = 10;
            // Block 7:
            while (true) {
                // Block 8:
                if (judge > N) {
                    // Block 9:
                    break;
                }
                // Block 10:
                else {
                    // Block 11:
                    ans += N / judge;
                    // Block 12:
                    judge *= 5;
                }
            }
            // Block 13:
            System.out.println(ans);
        }
        // Block END.
    }
    }
}
