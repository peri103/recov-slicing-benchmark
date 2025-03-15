import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 15;
        // Block 2:
        int b = 18;
        // Block 3:
        int c = 26;
        // Block 4:
        int d = 35;
        // Block 5:
        int e = 36;
        // Block 6:
        int k = 18;
        // Block 7:
        int f = 0;
        // Block 8:
        int[] values = {a, b, c, d, e};
        for (int i : values) {
            // Block 9:
            for (int j : values) {
                // Block 10:
                if (Math.abs(i - j) > k) {
                    // Block 11:
                    f = f + 1;
                }
            }
        }
        // Block 12:
        if (f > 0) {
            // Block 13:
            System.out.println(":(");
        // Block 14:
        } else {
            // Block 15:
            System.out.println("Yay!");
        }
        // Block END.
    }
    }
}
