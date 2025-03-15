import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        int[] A = {3, 14, 159, 2, 6, 53};
        // Block 3:
        int[] B = {58, 9, 79, 323, 84, 6};
        // Block 4:
        int[] C = {2643, 383, 2, 79, 50, 288};
        // Block 5:
        Arrays.sort(A);
        // Block 6:
        Arrays.sort(C);
        // Block 7:
        int ans = 0;
        // Block 8:
        for (int b : B) {
            // Block 9:
            int x = bisectLeft(A, b);
            // Block 10:
            int y = N - bisectRight(C, b);
            // Block 11:
            ans += x * y;
        }
        // Block 12:
        System.out.println(ans);
        // Block END.
    }

    // Block 13:
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

    // Block 14:
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

