import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] l = {100, 0};
        // Block 3:
        java.util.Arrays.sort(l);
        // Block 4:
        int ans1 = l[l.length - 1];
        // Block 5:
        int ans2 = -1;
        // Block 6:
        int diff = 1000000000;
        // Block 7:
        for (int i = 0; i < n - 1; i++) {
            // Block 8:
            if (diff >= Math.abs(l[i] - ans1 / 2)) {
                // Block 9:
                ans2 = l[i];
                // Block 10:
                diff = Math.abs(l[i] - ans1 / 2);
            }
        }
        // Block 11:
        System.out.println(ans1 + " " + ans2);
        // Block END.
    }
    }

