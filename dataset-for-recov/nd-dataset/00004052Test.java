import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 15, m2 = 0, k = 30;
        // Block 2:
        int s = h1 * 60 + m1;
        // Block 3:
        int t = h2 * 60 + m2;
        // Block 4:
        int ans = t - s - k;
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }

