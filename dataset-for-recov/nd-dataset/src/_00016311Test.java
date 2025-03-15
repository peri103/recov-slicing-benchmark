import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _00016311Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a = {6, 9, 4, 2, 11};
        // Block 3:
        Arrays.sort(a);
        // Block 4:
        int large = a[a.length - 1];
        // Block 5:
        a = Arrays.copyOf(a, a.length - 1); // Remove the last element
        // Block 6:
        double[] min_list = {0, large / 2.0};
        // Block 7:
        for (int i : a) {
            // Block 8:
            if (Math.abs(i - large / 2.0) < min_list[1]) {
                // Block 9:
                min_list[0] = i;
                min_list[1] = Math.abs(i - large / 2.0);
            }
        }
        // Block 10:
        System.out.println(large + " " + (int) min_list[0]);
        // Block END.
    }
    }

