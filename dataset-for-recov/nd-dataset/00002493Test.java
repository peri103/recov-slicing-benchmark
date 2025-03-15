import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class _00002493Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] N = {4, 9, 0, 8};
        // Block 2:
        Map<Integer, Boolean> dic = new HashMap<>();
        dic.put(1, false);
        dic.put(9, false);
        dic.put(7, false);
        dic.put(4, false);
        // Block 3:
        for (int n : N) {
            // Block 4:
            dic.put(n, true);
        }
        // Block 5:
        if (dic.values().stream().allMatch(v -> v)) {
            // Block 6:
            System.out.println("YES");
        // Block 7:
        } else {
            // Block 8:
            System.out.println("NO");
        }
        // Block END.
    }
    }

