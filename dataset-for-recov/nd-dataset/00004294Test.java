import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H_1 = 10, M_1 = 0, H_2 = 12, M_2 = 0, K = 120;
        // Block 2:
        int time_1 = H_1 * 60 + M_1;
        // Block 3:
        int time_2 = H_2 * 60 + M_2;
        // Block 4:
        System.out.println(time_2 - time_1 - K);
        // Block END.
    }
    }

