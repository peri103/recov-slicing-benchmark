import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int ans1 = Math.min(a, b);
        // Block 3:
        int ans2 = Math.max(0, a + b - n);
        // Block 4:
        System.out.println(String.format("%d %d", ans1, ans2));
        // Block END.
    }
    }
}
