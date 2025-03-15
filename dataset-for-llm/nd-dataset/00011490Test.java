import java.util.HashMap;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        HashMap<String, Integer> a = new HashMap<>();
        a.put("SUN", 7);
        a.put("MON", 6);
        a.put("TUE", 5);
        a.put("WED", 4);
        a.put("THU", 3);
        a.put("FRI", 2);
        a.put("SAT", 1);
        // Block 2:
        System.out.println(a.get("SAT"));
        // Block END.
    }
    }
}
