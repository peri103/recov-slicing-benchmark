import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        int max_ = Math.min(a, b);
        // Block 3:
        if (Math.max(n, a + b) == a + b) {
            // Block 4:
            int min_ = a + b - n;
            // Block 5:
        } else {
            // Block 6:
            int min_ = 0;
        }
        // Block 7:
        System.out.println(max_ + " " + min_);
        // Block END.
    }
    }

