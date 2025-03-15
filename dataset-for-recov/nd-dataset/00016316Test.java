import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class _00016316Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] A = {6, 9, 4, 2, 11};
        // Block 3:
        int mx = Integer.MIN_VALUE;
        for (int num : A) {
            mx = Math.max(mx, num);
        }
        // Block 4:
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : A) {
            if (a < mx) {
                list.add(a);
            }
        }
        // Block 5:
        Collections.sort(list, (a, b) -> Double.compare(Math.abs(mx / 2.0 - a), Math.abs(mx / 2.0 - b)));
        // Block 6:
        System.out.println(mx + " " + list.get(0));
        // Block END.
    }
    }

