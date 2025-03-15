import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 4, K = 3;
        // Block 2:
        int[] A = {2, 3, 1, 4};
        // Block 3:
        int cnt = 0;
        // Block 4:
        for (int i = 0; i <= 100000; i++) {
            // Block 5:
            N -= K;
            // Block 6:
            cnt += 1;
            // Block 7:
            if (N <= 0) {
                // Block 8:
                break;
            }
            // Block 9:
            else {
                // Block 10:
                N += 1;
            }
        }
        // Block 11:
        System.out.println(cnt);
        // Block END.
    }
    }
}
