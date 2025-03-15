import org.junit.jupiter.api.Test;

class _00000691Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int a = 7;
        // Block 3:
        int flag = 0;
        // Block 4:
        for (int i = 1; i <= k; i++) {
            // Block 5:
            if (a % k == 0) {
                // Block 6:
                System.out.println(i);
                // Block 7:
                flag = 1;
                // Block 8:
                break;
            }
            // Block 9:
            a = 10 * (a % k) + 7;
        }
        // Block 10:
        if (flag == 0) {
            // Block 11:
            System.out.println(-1);
        }
        // Block END.
    }
    }

