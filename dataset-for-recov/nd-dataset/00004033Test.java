import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        M1 += H1 * 60;
        // Block 3:
        M2 += H2 * 60;
        // Block 4:
        System.out.println(M2 - M1 - K);
        // Block END.
    }
    }
}
