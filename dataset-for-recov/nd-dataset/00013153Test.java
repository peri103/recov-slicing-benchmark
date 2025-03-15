import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 5;
        // Block 2:
        int[] data = {7, 5, 3};
        // Block 3:
        boolean found = false;
        for (int value : data) {
            if (value == x) {
                found = true;
                break;
            }
        }
        if (found) {
            // Block 4:
            System.out.println("YES");
        } else {
            // Block 5:
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
    }

