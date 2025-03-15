import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class _00011260Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "SAT";
        // Block 2:
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int[] values = {7, 6, 5, 4, 3, 2, 1};
        // Block 4:
        Map<String, Integer> d = new HashMap<>();
        for (int i = 0; i < day.length; i++) {
            d.put(day[i], values[i]);
        }
        // Block 5:
        System.out.println(d.get(a));
        // Block END.
    }
    }

