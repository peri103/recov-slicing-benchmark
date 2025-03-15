import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        System.out.println(H2 * 60 + M2 - H1 * 60 - M1 - K);
        // Block END.
    }
    }
}
