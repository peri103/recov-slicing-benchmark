import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] shichigosan = {3, 5, 7};
        boolean found = false;
        // Block 3:
        for (int num : shichigosan) {
            if (n == num) {
                found = true;
                break;
            }
        }
        // Block 4:
        if (found) {
            System.out.println("YES");
        }
        // Block 5:
        else {
            // Block 6:
            System.out.println("NO");
        }
        // Block END.
    }
    }
}
