import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 2;
        // Block 2:
        int w = 100;
        // Block 3:
        int n = 200;
        // Block 4:
        int temp = Math.max(h, w);
        w = Math.min(h, w);
        h = temp;
        // Block 5:
        int black_tile = 0;
        // Block 6:
        for (int i = 0; i < w; i++) {
            // Block 7:
            black_tile += h;
            // Block 8:
            if (black_tile >= n) break;
        }
        // Block 9:
        System.out.println(i + 1);
        // Block END.
    }
    }

