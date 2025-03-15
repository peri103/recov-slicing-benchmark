import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int res = 0;
            // Block 6:
            int m = 10;
            // Block 7:
            while (n / m > 0) {
                // Block 8:
                res += n / m;
                // Block 9:
                m *= 5;
            }
            // Block 10:
            System.out.println(res);
        }
        // Block END.
    }
    }
}
