import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        if (n - (a + b) > 0) {
            // Block 3:
            System.out.println(Math.min(a, b) + " " + 0);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(Math.min(a, b) + " " + Math.abs(n - (a + b)));
        }
        // Block END.
    }
    }

