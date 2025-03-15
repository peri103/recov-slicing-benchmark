import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 15, m2 = 0, k = 30;
        // Block 2:
        int t1 = h1 * 60 + m1, t2 = h2 * 60 + m2;
        // Block 3:
        if (t1 > t2) {
            // Block 4:
            t2 += 60 * 24;
        }
        // Block 5:
        int ans = t2 - t1 - k;
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }
}
