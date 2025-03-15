import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 64146, b = 123, c = 456;
        // Block 2:
        int n = a / (b + c);
        // Block 3:
        int m = a - n * (b + c);
        // Block 4:
        if (m / c == 1) {
            // Block 5:
            System.out.println(n);
        // Block 6:
        } else {
            // Block 7:
            System.out.println(n - 1);
        }
        // Block END.
    }
    }
}
