import java.util.*;
import org.junit.jupiter.api.Test;

class _00018854Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6, x = 1;
        // Block 2:
        int[] values = Arrays.stream("1 6 1 2 0 4".split(" ")).mapToInt(Integer::parseInt).toArray();
        // Block 3:
        int count = 0;
        // Block 4:
        int v1 = values[0];
        // Block 5:
        for (int i = 1; i < values.length; i++) {
            int v2 = values[i];
            // Block 6:
            int surplus = Math.max(v1 + v2 - x, 0);
            // Block 7:
            count += surplus;
            // Block 8:
            v1 = Math.max(0, v2 - surplus);
        }
        // Block 9:
        System.out.println(count);
        // Block END.
    }
    }

