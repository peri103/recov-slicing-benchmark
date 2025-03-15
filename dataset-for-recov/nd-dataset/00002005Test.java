import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int X = (A < B) ? A : B;
        // Block 3:
        int Y = (N > A + B) ? 0 : (A + B - N);
        // Block 4:
        System.out.println(String.format("%d %d", X, Y));
        // Block END.
    }
    }
}
