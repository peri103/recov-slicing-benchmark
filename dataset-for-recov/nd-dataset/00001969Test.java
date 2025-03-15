import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int nmax = Math.min(a, b);
        // Block 3:
        int nmin = Math.max(a + b - n, 0);
        // Block 4:
        System.out.println(nmax + " " + nmin);
        // Block END.
    }
    }

