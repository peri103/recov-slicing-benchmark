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
        int v = Math.max(h, w);
        // Block 5:
        int cnt = (n - 1) / v + 1;
        // Block 6:
        System.out.println(cnt);
        // Block END.
    }
    }

