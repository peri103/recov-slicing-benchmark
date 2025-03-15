import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 210, N = 5;
        // Block 2:
        int[] data = {31, 41, 59, 26, 53};
        // Block 3:
        int S = 0;
        // Block 4:
        for (int i = 0; i < data.length; i++) {
            // Block 5:
            S += data[i];
        }
        // Block 6:
        if (H > S) {
            // Block 7:
            System.out.println("No");
        // Block 8:
        } else {
            // Block 9:
            System.out.println("Yes");
        }
        // Block END.
    }
    }
}
