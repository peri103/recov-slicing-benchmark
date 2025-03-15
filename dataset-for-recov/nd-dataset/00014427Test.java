import org.junit.jupiter.api.Test;

class _00014427Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        int[] a = {1, 2, 3, 2, 2, 1};
        int b = -1;
        int x = 1;
        // Block 2:
        for (int i = 0; i < n - 1; i++) {
            // Block 3:
            if (b == 0) {
                // Block 4:
                if (a[i] > a[i + 1]) {
                    b = -1; 
                    x += 1;
                }
            // Block 5:
            } else if (b == 1) {
                // Block 6:
                if (a[i] < a[i + 1]) {
                    b = -1; 
                    x += 1;
                }
            // Block 7:
            } else {
                // Block 8:
                if (a[i] < a[i + 1]) {
                    b = 0;
                // Block 9:
                } else if (a[i] > a[i + 1]) {
                    b = 1;
                }
            }
        }
        // Block 10:
        System.out.println(x);
        // Block END.
    }
    }

