import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        if (a + b > n) {
            System.out.println(Math.min(a, b) + " " + (a + b - n));
        } else {
            System.out.println(Math.min(a, b) + " 0");
        }
        // Block END.
    }
    }

