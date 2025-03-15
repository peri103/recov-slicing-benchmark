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
        int ans = Math.min((n + h - 1) / h, (n + w - 1) / w);
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }
}
