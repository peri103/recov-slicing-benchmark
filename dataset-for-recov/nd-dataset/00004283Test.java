import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 15, M2 = 0, K = 30;
        // Block 2:
        int hk = K / 60;
        // Block 3:
        int mk = K % 60;
        // Block 4:
        int ans = (H2 - hk) * 60 + (M2 - mk) - (H1 * 60 + M1);
        // Block 5:
        System.out.println(Math.max(ans, 0));
        // Block END.
    }
    }
}
