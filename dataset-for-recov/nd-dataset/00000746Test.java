import java.util.HashSet;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int x = 7 % k;
        // Block 3:
        int i = 1;
        // Block 4:
        HashSet<Integer> set = new HashSet<>();
        // Block 5:
        boolean is_there = false;
        // Block 6:
        while (!is_there) {
            // Block 7:
            set.add(x);
            // Block 8:
            if (x == 0) {
                // Block 9:
                System.out.println(i);
                // Block 10:
                break;
            }
            // Block 11:
            x = (x * 10 + 7) % k;
            // Block 12:
            if (set.contains(x)) {
                // Block 13:
                is_there = true;
            }
            // Block 14:
            set.add(x);
            // Block 15:
            i++;
            // Block 16:
            if (x == 0) {
                // Block 17:
                System.out.println(i);
                // Block 18:
                break;
            }
        }
        // Block 19:
        else {
            // Block 20:
            System.out.println("-1");
        }
        // Block END.
    }
    }

