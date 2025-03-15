import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2, p = 0;
        // Block 2:
        int[] a = {1, 3};
        // Block 3:
        boolean[] flg_lst = new boolean[n];
        // Block 4:
        for (int i = 0; i < n; i++) {
            // Block 5:
            if (a[i] % 2 == 0) {
                // Block 6:
                flg_lst[i] = true;
            }
            // Block 7:
            else {
                // Block 8:
                flg_lst[i] = false;
            }
        }
        // Block 9:
        boolean foundFalse = false;
        for (boolean flag : flg_lst) {
            if (!flag) {
                foundFalse = true;
                break;
            }
        }
        if (foundFalse) {
            // Block 10:
            System.out.println((int) Math.pow(2, n - 1));
        }
        // Block 11:
        else {
            // Block 12:
            if (p == 0) {
                // Block 13:
                System.out.println((int) Math.pow(2, n));
            }
            // Block 14:
            else {
                // Block 15:
                System.out.println(0);
            }
        }
        // Block END.
    }
    }

