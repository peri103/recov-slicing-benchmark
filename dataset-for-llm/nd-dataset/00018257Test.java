import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 3;
        // Block 2:
        int W = 7;
        // Block 3:
        int N = 10;
        // Block 4:
        int A_div = N / H;
        int A_mod = N % H;
        // Block 5:
        if (A_mod != 0) {
            // Block 6:
            A_div += 1;
        }
        // Block 7:
        int B_div = N / W;
        int B_mod = N % W;
        // Block 8:
        if (B_mod != 0) {
            // Block 9:
            B_div += 1;
        }
        // Block 10:
        System.out.println(Math.min(A_div, B_div));
        // Block END.
    }
    }
}
