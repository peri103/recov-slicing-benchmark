import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 12;
        // Block 2:
        int p = 10;
        // Block 3:
        int a = 0;
        // Block 4:
        if (n % 2 == 0) {
            // Block 5:
            while (p <= n) {
                // Block 6:
                a += n / p;
                // Block 7:
                p *= 5;
            }
        }
        // Block 8:
        System.out.println(a);
        // Block END.
    }
    }
}
