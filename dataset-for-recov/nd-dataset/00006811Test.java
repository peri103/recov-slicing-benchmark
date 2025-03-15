import java.util.HashMap;
import org.junit.jupiter.api.Test;

class _00006811Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] z = {210, 5};
        // Block 2:
        int[] x = {31, 41, 59, 26, 53};
        // Block 3:
        HashMap<Integer, Integer> d = new HashMap<>();
        // Block 4:
        int c = 0;
        // Block 5:
        for (int i : x) {
            // Block 6:
            if (d.getOrDefault(i, 0) == 0) {
                // Block 7:
                c += i;
            }
        }
        // Block 8:
        if (c >= z[0]) {
            // Block 9:
            System.out.println("Yes");
        }
        // Block 10:
        else {
            // Block 11:
            System.out.println("No");
        }
        // Block END.
    }
    }

