import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 10, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        int x = 0;
        for (int num : a) {
            x += num;
        }
        // Block 4:
        if ((h - x) <= 0) {
            // Block 5:
            System.out.println("Yes");
        // Block 6:
        } else {
            // Block 7:
            System.out.println("No");
        }
        // Block END.
    }
    }
}
