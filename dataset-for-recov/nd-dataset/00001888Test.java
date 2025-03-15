import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        if (a + b > n) {
            // Block 3:
            int q = a + b - n;
            // Block 4:
        } else {
            // Block 5:
            int q = 0;
        }
        // Block 6:
        System.out.println(Math.min(a, b) + " " + q);
        // Block END.
    }
    }

