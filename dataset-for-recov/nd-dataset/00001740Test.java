import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        System.out.println(Math.min(a, b));
        // Block 3:
        if (a + b <= n) {
            // Block 4:
            System.out.println('0');
        // Block 5:
        } else {
            // Block 6:
            System.out.println((a + b) - n);
        }
        // Block END.
    }
    }
}
