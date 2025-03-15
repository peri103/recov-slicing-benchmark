import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 1, b = 1, k = 1;
        // Block 2:
        int i = Math.min(a, b) + 1;
        // Block 3:
        while (k > 0) {
            // Block 4:
            i -= 1;
            // Block 5:
            if (Math.max(a % i, b % i) == 0) {
                // Block 6:
                k -= 1;
            }
        }
        // Block 7:
        System.out.println(i);
        // Block END.
    }
    }
}
