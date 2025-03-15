import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1, P = 1;
        // Block 2:
        int[] A = {50};
        // Block 3:
        int[] ans = {1, 0};
        // Block 4:
        for (int a : A) {
            // Block 5:
            if (a % 2 != 0) {
                // Block 6:
                int temp = ans[1];
                ans[1] = ans[1] + ans[0];
                ans[0] = temp + ans[0];
            }
            // Block 7:
            else {
                // Block 8:
                ans[0] = ans[0] * 2;
                // Block 9:
                ans[1] = ans[1] * 2;
            }
        }
        // Block 10:
        System.out.println(ans[P]);
        // Block END.
    }
    }

