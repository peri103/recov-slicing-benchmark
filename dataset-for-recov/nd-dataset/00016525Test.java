import java.util.*;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a_list = {6, 9, 4, 2, 11};
        // Block 3:
        Arrays.sort(a_list);
        // Block 4:
        int a_max = a_list[n - 1];
        // Block 5:
        int[] temp_max = {1, 0};
        // Block 6:
        int bunbo = 1;
        // Block 7:
        int bunshi = 1;
        // Block 8:
        int center = (a_max + 1) / 2;
        // Block 9:
        Set<Integer> a_set = new HashSet<>();
        for (int a : a_list) {
            a_set.add(a);
        }
        // Block 10:
        int diff_min = a_max;
        // Block 11:
        int ans = 0;
        // Block 12:
        for (int a : a_set) {
            // Block 13:
            int diff = Math.abs(a - center);
            // Block 14:
            if (diff_min > diff) {
                // Block 15:
                diff_min = diff;
                // Block 16:
                ans = a;
            }
        }
        // Block 17:
        System.out.println(a_max + " " + ans);
        // Block END.
    }
    }
}
