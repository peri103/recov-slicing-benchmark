import org.junit.jupiter.api.Test;

class _00000791Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int num = 0;
        // Block 3:
        if (k % 2 == 0) {
            // Block 4:
            System.out.println(-1);
        } 
        // Block 5:
        else {
            // Block 6:
            for (int i = 0; i < k; i++) {
                // Block 7:
                num = (num * 10 + 7) % k;
                // Block 8:
                if (num == 0) {
                    // Block 9:
                    System.out.println(i + 1);
                    // Block 10:
                    break;
                }
            }
            // Block 11:
            else {
                // Block 12:
                System.out.println(-1);
            }
        }
        // Block END.
    }
    }

