import org.junit.jupiter.api.Test;

class _00004338Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 12, m2 = 0, k = 120;
        // Block 2:
        int t = (h2 - h1) * 60 + m2 - m1 - k;
        // Block 3:
        System.out.println(t >= 0 ? t : 0);
        // Block END.
    }
    }

