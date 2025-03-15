import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        Arrays.sort(a);
        // Block 4:
        int left = a[a.length - 1];
        a = Arrays.copyOf(a, a.length - 1); // Remove last element
        // Block 5:
        double yoi = left / 2.0;
        // Block 6:
        for (int i = 0; i < n - 1; i++) {
            // Block 7:
            if (a[i] >= yoi) {
                // Block 8:
                a[i] = Math.abs(a[i] - (int)yoi) * 1;
            }
            // Block 9:
            else {
                // Block 10:
                a[i] = Math.abs(a[i] - (int)yoi) * -1;
            }
        }
        // Block 11:
        Arrays.sort(a);
        // Block 12:
        int right = Math.abs(a[0] + (a[0] >= 0 ? 1 : -1) * (int)yoi);
        // Block 13:
        System.out.println(left + " " + right);
        // Block END.
    }
    }
}
