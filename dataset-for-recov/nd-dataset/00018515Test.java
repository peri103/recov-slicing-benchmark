import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        int a = Math.max(w, h);
        // Block 5:
        int ans = n / a + (n % a > 0 ? 1 : 0);
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }

