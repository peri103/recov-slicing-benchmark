import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 14;
        // Block 2:
        int w = 12;
        // Block 3:
        int n = 112;
        // Block 4:
        int p = Math.max(h, w);
        // Block 5:
        System.out.println(n / p + (n % p != 0 ? 1 : 0));
        // Block END.
    }
    }

