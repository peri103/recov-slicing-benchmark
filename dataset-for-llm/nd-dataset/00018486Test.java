import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 14;
        // Block 2:
        int W = 12;
        // Block 3:
        int N = 112;
        // Block 4:
        int a = Math.max(H, W);
        // Block 5:
        if (N % a == 0) {
            // Block 6:
            System.out.println(N / a);
        } else {
            // Block 7:
            System.out.println(N / a + 1);
        }
        // Block END.
    }
    }
}
