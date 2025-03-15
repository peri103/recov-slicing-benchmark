import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 3, B = 5;
        // Block 2:
        int ma = Math.min(A, B);
        // Block 3:
        int mi = Math.max(0, (A + B) - N);
        // Block 4:
        System.out.println(String.format("%d %d", ma, mi));
        // Block END.
    }
    }
}
