import org.junit.jupiter.api.Test;

class _00018347Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 3;
        // Block 2:
        int W = 7;
        // Block 3:
        int N = 10;
        // Block 4:
        N += Math.max(H - 1, W - 1);
        // Block 5:
        int ans = N / Math.max(H, W);
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }

