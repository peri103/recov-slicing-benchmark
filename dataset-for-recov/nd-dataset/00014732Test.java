import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3, P = 0;
        // Block 2:
        int[] A = {1, 1, 1};
        // Block 3:
        int[] dic = {0, 0}; // dic[0] for "even", dic[1] for "odd"
        // Block 4:
        for (int i = 0; i < N; i++) {
            // Block 5:
            if (A[i] % 2 == 0) {
                // Block 6:
                dic[0] += 1; // even count
            }
            // Block 7:
            else {
                // Block 8:
                dic[1] += 1; // odd count
            }
        }
        // Block 9:
        if (dic[1] == 0) {
            // Block 10:
            if (P == 1) {
                // Block 11:
                System.out.println(0);
            }
            // Block 12:
            else {
                // Block 13:
                System.out.println(Math.pow(2, dic[0]));
            }
        }
        // Block 14:
        else {
            // Block 15:
            System.out.println(Math.pow(2, N - 1));
        }
        // Block END.
    }
    }

