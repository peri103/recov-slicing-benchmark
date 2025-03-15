import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3, p = 0;
        // Block 2:
        int[] a = {1, 1, 1};
        // Block 3:
        boolean allEven = true;
        for (int i : a) {
            if (i % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            // Block 4:
            if (p == 1) {
                // Block 5:
                System.out.println(0);
            }
            // Block 6:
            else {
                // Block 7:
                System.out.println((int) Math.pow(2, n));
            }
        }
        // Block 8:
        else {
            // Block 9:
            System.out.println((int) Math.pow(2, n - 1));
        }
        // Block END.
    }
    }
}
