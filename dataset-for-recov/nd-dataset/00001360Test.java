import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 111;
        // Block 2:
        for (int i = 1; i < 10; i++) {
            // Block 3:
            int ans = i * 111;
            // Block 4:
            if (ans >= n) {
                // Block 5:
                System.out.println(ans);
                // Block 6:
                break;
            }
        }
        // Block END.
    }
    }
}
