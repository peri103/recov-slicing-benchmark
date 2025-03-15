import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 101;
        // Block 2:
        int sevens = 7 % K;
        // Block 3:
        int count = 1;
        // Block 4:
        while (sevens % K != 0) {
            // Block 5:
            sevens = sevens * (10 % K) + (7 % K);
            // Block 6:
            sevens = sevens % K;
            // Block 7:
            count += 1;
            // Block 8:
            if (count > K) {
                // Block 9:
                count = -1;
                // Block 10:
                break;
            }
        }
        // Block 11:
        System.out.println(count);
        // Block END.
    }
    }
}
