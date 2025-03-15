import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int S = Math.min(A, B);
        // Block 3:
        int T = 0;
        // Block 4:
        if (A + B > N) {
            // Block 5:
            T = (A + B) - N;
        }
        // Block 6:
        System.out.println(S + " " + T);
        // Block END.
    }
    }
}
