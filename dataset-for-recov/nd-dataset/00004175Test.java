import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 12, m2 = 0, k = 120;
        // Block 2:
        int s = h1 * 60 + m1;
        // Block 3:
        int e = h2 * 60 + m2;
        // Block 4:
        System.out.println(e - k - s);
        // Block END.
    }
    }
}
