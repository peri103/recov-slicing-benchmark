import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100;
        // Block 2:
        if (n % 2 == 0) {
            // Block 3:
            System.out.println(Math.round(n / 2.0));
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println(Math.round((n + 1) / 2.0));
        }
        // Block END.
    }
    }

