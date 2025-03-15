import org.junit.jupiter.api.Test;

class _00007517Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 10, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        String ans = "No";
        // Block 4:
        int total = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            total += a[i];
            // Block 7:
            if (total >= h) {
                // Block 8:
                ans = "Yes";
                // Block 9:
                break;
            }
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

