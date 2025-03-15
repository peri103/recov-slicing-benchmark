import org.junit.jupiter.api.Test;

class _00007639Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 210, N = 5;
        // Block 2:
        int[] A = {31, 41, 59, 26, 53};
        // Block 3:
        int sum = 0;
        // Block 4:
        for (int i = 0; i < A.length; i++) {
            // Block 5:
            sum = sum + A[i];
        }
        // Block 6:
        if (sum >= H) {
            // Block 7:
            System.out.println("Yes");
        // Block 8:
        } else {
            // Block 9:
            System.out.println("No");
        }
        // Block END.
    }
    }

