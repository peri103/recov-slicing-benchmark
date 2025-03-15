import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h1 = 10, m1 = 0, h2 = 15, m2 = 0, k = 30;
        // Block 2:
        int all = 0;
        // Block 3:
        if (m2 >= m1) {
            // Block 4:
            all += (h2 - h1) * 60 + (m2 - m1);
            // Block 5:
            all -= k;
        }
        // Block 6:
        else {
            // Block 7:
            all += (h2 - 1 - h1) * 60 + (m2 + 60 - m1);
            // Block 8:
            all -= k;
        }
        // Block 9:
        System.out.println(all);
        // Block END.
    }
    }
}
