import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 1, b = 1, k = 1;
        // Block 2:
        ArrayList<Integer> ans = new ArrayList<>();
        // Block 3:
        int n;
        if (a > b) {
            // Block 4:
            n = a;
        } else if (a < b) {
            // Block 5:
            n = b;
        } else {
            // Block 6:
            n = a;
        }
        // Block 9:
        for (int x = 1; x <= n; x++) {
            // Block 10:
            if (b % x == 0) {
                // Block 11:
                if (a % x == 0) {
                    // Block 12:
                    ans.add(x);
                }
            }
        }
        // Block 13:
        System.out.println(ans.get(ans.size() - k));
        // Block END.
    }
    }
}
