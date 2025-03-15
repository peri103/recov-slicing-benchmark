import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int X = Math.min(A, B);
        // Block 3:
        int Y = Math.max(0, A + B - N);
        // Block 4:
        System.out.println(X + " " + Y);
        // Block END.
    }
    }

