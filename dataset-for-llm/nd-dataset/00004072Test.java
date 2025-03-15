import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 10, m = 0, a = 15, b = 0, k = 30;
        // Block 2:
        int h_to_min = h * 60;
        // Block 3:
        int a_to_min = a * 60;
        // Block 4:
        int re1 = a_to_min - h_to_min;
        // Block 5:
        int re2 = b - m;
        // Block 6:
        int re = re1 + re2;
        // Block 7:
        System.out.println(re - k);
        // Block END.
    }
    }
}
