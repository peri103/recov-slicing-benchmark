import org.junit.jupiter.api.Test;

class _00018243Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 14;
        // Block 2:
        int W = 12;
        // Block 3:
        int N = 112;
        // Block 4:
        int A = (H > W) ? H : W;
        // Block 5:
        if (N % A == 0) {
            // Block 6:
            System.out.println(N / A);
        }
        // Block 7:
        else {
            // Block 8:
            System.out.println(N / A + 1);
        }
        // Block END.
    }
    }

