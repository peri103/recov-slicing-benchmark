import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        int ans = 0;
        // Block 3:
        if (M1 <= M2) {
            // Block 4:
            ans = (H2 - H1) * 60 + M2 - M1 - K;
        }
        // Block 5:
        else {
            // Block 6:
            ans = (H2 - H1 - 1) * 60 + (60 - M1) + M2 - K;
        }
        // Block 7:
        if (ans < 0) {
            // Block 8:
            System.out.println(0);
        }
        // Block 9:
        else {
            // Block 10:
            System.out.println(ans);
        }
        // Block END.
    }
    }
}
