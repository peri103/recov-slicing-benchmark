import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 4, k = 3;
        // Block 2:
        int[] a = {2, 3, 1, 4};
        // Block 3:
        int fi = 0;
        // Block 4:
        for (int i = 0; i < n; i++) {
            // Block 5:
            if (a[i] == 1) {
                // Block 6:
                fi = i;
                // Block 7:
                break;
            }
        }
        // Block 8:
        if ((n - 1) % (k - 1) == 0) {
            // Block 9:
            System.out.println((n - 1) / (k - 1));
        }
        // Block 10:
        else {
            // Block 11:
            System.out.println((n - 1) / (k - 1) + 1);
        }
        // Block END.
    }
    }

