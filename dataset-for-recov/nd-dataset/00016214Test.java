import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        java.util.Arrays.sort(a);
        // Block 4:
        java.util.List<Integer> k = new java.util.ArrayList<>();
        // Block 5:
        int max_a = a[a.length - 1];
        // Block 6:
        double max_half = max_a / 2.0; // Use double for accurate division
        // Block 7:
        for (int i = 0; i < n; i++) {
            // Block 8:
            if (a[i] >= max_half) {
                // Block 9:
                if (i == 0) {
                    // Block 10:
                    k.add(a[i]);
                    // Block 11:
                    break;
                }
                // Block 12:
                k.add(a[i]);
                // Block 13:
                k.add(a[i - 1]);
                // Block 14:
                break;
            }
        }
        // Block 15:
        int ans = 0;
        // Block 16:
        if (k.size() == 1) {
            // Block 17:
            ans = k.get(0);
        }
        // Block 18:
        else {
            // Block 19:
            if (Math.abs(max_half - k.get(0)) < Math.abs(max_half - k.get(1))) {
                // Block 20:
                ans = k.get(0);
            }
            // Block 21:
            else {
                // Block 22:
                ans = k.get(1);
            }
        }
        // Block 23:
        System.out.println(max_a + " " + ans);
        // Block END.
    }
    }

