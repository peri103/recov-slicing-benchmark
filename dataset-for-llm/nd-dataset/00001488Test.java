import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 750;
        // Block 2:
        if (N % 111 == 0) {
            // Block 3:
            System.out.println(N);
        } else {
            // Block 4:
            for (int i = 0; i < 110; i++) {
                // Block 5:
                N += 1;
                // Block 6:
                if (N % 111 == 0) {
                    // Block 7:
                    break;
                }
            }
            // Block 8:
            System.out.println(N);
        }
        // Block END.
    }
    }
}
