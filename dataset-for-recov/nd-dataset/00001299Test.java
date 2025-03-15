import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] N = {1, 1, 2};
        // Block 2:
        if (N[1] < N[0]) {
            // Block 3:
            System.out.println(N[0] * 111);
        // Block 4:
        } else if (N[1] > N[0]) {
            // Block 5:
            System.out.println((N[0] + 1) * 111);
        // Block 6:
        } else {
            // Block 7:
            if (N[2] <= N[0]) {
                // Block 8:
                System.out.println(N[0] * 111);
            // Block 9:
            } else {
                // Block 10:
                System.out.println((N[0] + 1) * 111);
            }
        }
        // Block END.
    }
    }

