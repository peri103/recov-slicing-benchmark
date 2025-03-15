import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1, P = 1;
        // Block 2:
        int[] A = {50};
        // Block 3:
        int even = 0;
        // Block 4:
        int odd = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            if (A[i] % 2 == 0) {
                // Block 7:
                even += 1;
            }
            // Block 8:
            else {
                // Block 9:
                odd += 1;
            }
        }
        // Block 10:
        int ans;
        if (odd >= 1) {
            // Block 11:
            ans = (int) Math.pow(2, even + odd - 1);
        }
        // Block 12:
        else if (P == 0) {
            // Block 13:
            ans = (int) Math.pow(2, even);
        }
        // Block 14:
        else {
            // Block 15:
            ans = 0;
        }
        // Block 16:
        System.out.println(ans);
        // Block END.
    }
    }
}
