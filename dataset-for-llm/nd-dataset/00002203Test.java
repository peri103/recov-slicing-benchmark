import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int both_max = Math.min(a, b);
        // Block 3:
        if (a + b <= n) {
            // Block 4:
            int both_min = 0;
            // Block 5:
            System.out.println(both_max + " " + both_min);
        } else {
            // Block 6:
            int both_min = a + b - n;
            // Block 7:
            System.out.println(both_max + " " + both_min);
        }
        // Block END.
    }
    }
}
