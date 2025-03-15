import java.util.HashMap;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        String[] ls = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int cnt = 0;
        // Block 4:
        HashMap<String, Integer> dict = new HashMap<>();
        // Block 5:
        for (String item : ls) {
            // Block 6:
            dict.put(item, cnt);
            // Block 7:
            cnt += 1;
        }
        // Block 8:
        System.out.println(7 - dict.get(S));
        // Block END.
    }
    }
}
