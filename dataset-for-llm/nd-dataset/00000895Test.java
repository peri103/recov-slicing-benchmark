import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 2;
        // Block 2:
        int a = 0;
        // Block 3:
        for (int i = 0; i < K; i++) {
            // Block 4:
            a = (10 * a + 7) % K;
            // Block 5:
            if (a % K == 0) {
                // Block 6:
                System.out.println(i + 1);
                // Block 7:
                System.exit(0);
            }
            // Block 8:
            else {
                // Block 9:
                a %= K;
            }
        }
        // Block 10:
        System.out.println(-1);
        // Block END.
    }
    }
}
