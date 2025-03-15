import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 15, M2 = 0, K = 30;
        // Block 2:
        int HM1 = H1 * 60 + M1;
        // Block 3:
        int HM2 = H2 * 60 + M2;
        // Block 4:
        System.out.println(Math.max(HM2 - HM1 - K, 0));
        // Block END.
    }
    }
}
