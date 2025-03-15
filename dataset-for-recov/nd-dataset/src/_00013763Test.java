import org.junit.jupiter.api.Test;

class _00013763Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 15, M2 = 0, K = 30;
        // Block 2:
        int ans = H2 * 60 + M2 - H1 * 60 - M1 - K;
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }

