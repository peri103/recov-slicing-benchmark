import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _00006399Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {1, 5};
        // Block 3:
        int[] b = {2, 4};
        // Block 4:
        int[] c = {3, 6};
        // Block 5:
        Arrays.sort(a);
        // Block 6:
        Arrays.sort(c);
        // Block 7:
        int cnt = 0;
        // Block 8:
        for (int i : b) {
            // Block 9:
            cnt += bisectLeft(a, i) * (n - bisectRight(c, i));
        }
        // Block 10:
        System.out.println(cnt);
        // Block END.
    }

    // Block 11:
    public static int bisectLeft(int[] array, int value) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Block 12:
    public static int bisectRight(int[] array, int value) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    }

