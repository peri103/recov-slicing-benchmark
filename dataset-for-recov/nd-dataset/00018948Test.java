import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        if (N % 2 != 0) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int answer = 0;
            // Block 6:
            int m = 10;
            // Block 7:
            while (m <= N) {
                // Block 8:
                answer += N / m;
                // Block 9:
                m *= 5;
            }
            // Block 10:
            System.out.println(answer);
        }
        // Block END.
    }
    }

