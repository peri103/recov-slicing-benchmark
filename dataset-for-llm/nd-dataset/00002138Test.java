import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int ma = Math.min(A, B);
        // Block 3:
        int mi = A + B - N;
        // Block 4:
        if (mi <= 0) {
            // Block 5:
            mi = 0;
        }
        // Block 6:
        System.out.println(ma + " " + mi);
        // Block END.
    }
    }
}
