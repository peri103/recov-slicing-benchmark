import org.junit.jupiter.api.Test;

class _00000849Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 101;
        // Block 2:
        int num = 7 % K;
        // Block 3:
        for (int i = 0; i < K; i++) {
            // Block 4:
            if (num % K == 0) {
                // Block 5:
                System.out.println(i + 1);
                // Block 6:
                break;
            }
            // Block 7:
            else {
                // Block 8:
                num = (num * 10 + 7) % K;
            }
        }
        // Block 9:
        else {
            // Block 10:
            System.out.println(-1);
        }
        // Block END.
    }
    }

