import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        java.util.HashMap<String, Integer> DAYS_TO_NUM = new java.util.HashMap<>();
        DAYS_TO_NUM.put("SUN", 0);
        DAYS_TO_NUM.put("MON", 1);
        DAYS_TO_NUM.put("TUE", 2);
        DAYS_TO_NUM.put("WED", 3);
        DAYS_TO_NUM.put("THU", 4);
        DAYS_TO_NUM.put("FRI", 5);
        DAYS_TO_NUM.put("SAT", 6);
        // Block 3:
        System.out.println(7 - DAYS_TO_NUM.get(S));
        // Block END.
    }
    }
}
