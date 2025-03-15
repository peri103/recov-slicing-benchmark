import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100;
        // Block 2:
        if (N % 2 == 1) {
            // Block 3:
            System.out.println((N - 1) / 2 + 1);
        // Block 4:
        } else {
            // Block 5:
            System.out.println(N / 2);
        }
        // Block END.
    }
    }
}
