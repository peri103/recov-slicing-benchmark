import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int K = 101;
        // Block 2:
        int mm = 7;
        // Block 3:
        int cnt = 1;
        // Block 4:
        for (int i = 0; i < Math.pow(10, 7); i++) {
            // Block 5:
            if (mm % K == 0) {
                // Block 6:
                System.out.println(cnt);
                // Block 7:
                break;
            }
            // Block 8:
            else {
                // Block 9:
                mm = mm * 10 + 7;
                // Block 10:
                mm %= K;
                // Block 11:
                cnt += 1;
            }
        }
        // Block 12:
        else {
            // Block 13:
            System.out.println(-1);
        }
        // Block END.
    }
    }

