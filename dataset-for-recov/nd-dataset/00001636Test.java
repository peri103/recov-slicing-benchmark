import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int maxInt = 0;
        // Block 3:
        int minInt = 0;
        // Block 4:
        if (a <= b) {
            // Block 5:
            maxInt = a;
            // Block 6:
            minInt = a - (n - b);
        } else {
            // Block 7:
            maxInt = b;
            // Block 8:
            minInt = b - (n - a);
        }
        // Block 10:
        if (a + b < n) {
            // Block 11:
            minInt = 0;
        }
        // Block 12:
        System.out.println(maxInt + " " + minInt);
        // Block END.
    }
    }
}
