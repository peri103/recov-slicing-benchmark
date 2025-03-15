import org.junit.jupiter.api.Test;

class _00019069Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 12;
        // Block 2:
        if (N % 2 != 0) {
            // Block 3:
            System.out.println(0);
            // Block 4:
            System.exit(0);
        }
        // Block 5:
        int ans = 0;
        // Block 6:
        int r = 10;
        // Block 7:
        while (r <= N) {
            // Block 8:
            ans += N / r;
            // Block 9:
            r *= 5;
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

