import java.util.HashMap;
import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        HashMap<String, String> List = new HashMap<>();
        List.put("SUN", "7");
        List.put("MON", "6");
        List.put("TUE", "5");
        List.put("WED", "4");
        List.put("THU", "3");
        List.put("FRI", "2");
        List.put("SAT", "1");
        // Block 3:
        System.out.println(List.get(S));
        // Block END.
    }
    }
}
