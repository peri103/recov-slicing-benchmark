import org.junit.jupiter.api.Test;

class _00004038Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 15, m2 = 0, k = 30;
        // Block 2:
        if (h1 > h2) {
            // Block 3:
            h2 += 24;
        }
        // Block 4:
        int h = h2 - h1;
        // Block 5:
        int m = m2 - m1;
        // Block 6:
        if (m < 0) {
            // Block 7:
            m = m + 60;
            // Block 8:
            h = h - 1;
        }
        // Block 9:
        int time = h * 60 + m;
        // Block 10:
        System.out.println(time - k);
        // Block END.
    }
    }

