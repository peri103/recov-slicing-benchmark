import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 3, B = 5;
        // Block 2:
        int maxA = Math.min(A, B);
        // Block 3:
        int minA = 0;
        // Block 4:
        if (N - Math.max(A, B) < maxA) {
            // Block 5:
            minA = maxA - (N - Math.max(A, B));
        }
        // Block 6:
        System.out.println(maxA + " " + minA);
        // Block END.
    }
    }
}
