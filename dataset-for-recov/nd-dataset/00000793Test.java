import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 2;
        // Block 2:
        int ans = 1;
        // Block 3:
        int num = 0;
        // Block 4:
        int seven = 7;
        // Block 5:
        if (K % 2 == 0) {
            // Block 6:
            System.out.println(-1);
        }
        // Block 7:
        else {
            // Block 8:
            for (int i = 0; i < K; i++) {
                // Block 9:
                num = num + seven;
                // Block 10:
                seven = seven * 10 % K;
                // Block 11:
                num = num % K;
                // Block 12:
                if (num == 0) {
                    // Block 13:
                    System.out.println(ans);
                    // Block 14:
                    break;
                }
                // Block 15:
                ans += 1;
            }
            // Block 16:
            else {
                // Block 17:
                System.out.println(-1);
            }
        }
        // Block END.
    }
    }
}
