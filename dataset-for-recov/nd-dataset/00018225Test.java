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
        int a = 0;
        // Block 5:
        int b = 0;
        // Block 6:
        int c = 0;
        // Block 7:
        int d = 0;
        // Block 8:
        for (int i = 0; i < h; i++) {
            // Block 9:
            a += w;
            // Block 10:
            b += 1;
            // Block 11:
            if (a >= n) {
                // Block 12:
                break;
            }
        }
        // Block 13:
        for (int i = 0; i < w; i++) {
            // Block 14:
            c += h;
            // Block 15:
            d += 1;
            // Block 16:
            if (c >= n) {
                // Block 17:
                break;
            }
        }
        // Block 18:
        if (b > d) {
            // Block 19:
            System.out.println(d);
        // Block 20:
        } else {
            // Block 21:
            System.out.println(b);
        }
        // Block END.
    }
    }
}
