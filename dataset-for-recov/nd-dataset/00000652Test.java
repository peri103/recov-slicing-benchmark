import org.junit.jupiter.api.Test;

class _00000652Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 2;
        // Block 2:
        int num = 0;
        // Block 3:
        int cnt = 0;
        // Block 4:
        int ans = -1;
        // Block 5:
        for (int i = 0; i < K; i++) {
            // Block 6:
            num = num * 10 + 7;
            // Block 7:
            cnt += 1;
            // Block 8:
            if (num % K != 0) {
                // Block 9:
                num = num % K;
            // Block 10:
            } else {
                // Block 11:
                ans = cnt;
                // Block 12:
                break;
            }
        }
        // Block 13:
        System.out.println(ans);
        // Block END.
    }
    }

