import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        int p = Math.min(a, b);
        // Block 3:
        int q = Math.max(a + b - n, 0);
        // Block 4:
        System.out.println(p + " " + q);
        // Block END.
    }
    }
}
