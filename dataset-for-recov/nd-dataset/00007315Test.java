import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 210, n = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        for (int i = 0; i < n; i++) {
            // Block 4:
            h -= A[i];
        }
        // Block 5:
        if (h > 0) {
            // Block 6:
            System.out.println("No");
        }
        // Block 7:
        else {
            // Block 8:
            System.out.println("Yes");
        }
        // Block END.
    }
    }

