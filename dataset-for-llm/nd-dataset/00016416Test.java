import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a = {6, 9, 4, 2, 11};
        // Block 3:
        Arrays.sort(a);
        // Block 4:
        int num = a[n - 1];
        // Block 5:
        int tmp = a[n - 2];
        // Block 6:
        for (int j = n - 2; j >= 0; j--) {
            // Block 7:
            if (Math.abs(tmp - num / 2.0) >= Math.abs(a[j] - num / 2.0)) {
                // Block 8:
                tmp = a[j];
            }
            // Block 9:
            else {
                // Block 10:
                break;
            }
        }
        // Block 11:
        int[] ans = {num, tmp};
        // Block 12:
        System.out.println(ans[0] + " " + ans[1]);
        // Block END.
    }
    }
}
