import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        long N = 999999999;
        // Block 2:
        if (N % 2 != 0) {
            System.out.println(2 * N);
        }
        // Block 3:
        else {
            System.out.println(N);
        }
        // Block END.
    }
    }

