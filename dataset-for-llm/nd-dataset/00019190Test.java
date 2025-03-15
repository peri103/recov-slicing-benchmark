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
            int cnt = 0;
            // Block 6:
            for (int i = 1; i < N; i++) {
                // Block 7:
                if (N >= 2 * (Math.pow(5, i))) {
                    // Block 8:
                    cnt += N / (2 * (int)(Math.pow(5, i)));
                }
                // Block 9:
                else {
                    // Block 10:
                    break;
                }
            }
            // Block 11:
            System.out.println(cnt);
        }
        // Block END.
    }
    }
}
