import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 20, b = 15;
        // Block 2:
        int ans = a - b * 2;
        // Block 3:
        if (ans < 0) {
            // Block 4:
            ans = 0;
        }
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }
}
