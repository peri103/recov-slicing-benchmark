import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 210, n = 5;
        // Block 2:
        int[] a = {31, 41, 59, 26, 53};
        // Block 3:
        for (int i = 0; i < n; i++) {
            // Block 4:
            h -= a[i];
        }
        // Block 5:
        System.out.println(h <= 0 ? "Yes" : "No");
        // Block END.
    }
    }

