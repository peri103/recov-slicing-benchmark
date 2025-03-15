import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] a = {20, 30};
        // Block 2:
        int x = a[1] * 2;
        // Block 3:
        if (x >= a[0]) {
            // Block 4:
            System.out.println(0);
        // Block 5:
        } else {
            // Block 6:
            System.out.println(a[0] - x);
        }
        // Block END.
    }
    }
}
