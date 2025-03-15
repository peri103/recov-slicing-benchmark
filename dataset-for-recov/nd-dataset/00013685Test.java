import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 15, m2 = 0, k = 30;
        // Block 2:
        int hm = ((h2 - h1) * 60) - (m1 - m2) - k;
        // Block 3:
        System.out.println(hm);
        // Block END.
    }
    }

