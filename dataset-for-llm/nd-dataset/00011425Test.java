import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        java.util.Map<String, Integer> week = new java.util.HashMap<>();
        week.put("SUN", 0);
        week.put("MON", 1);
        week.put("TUE", 2);
        week.put("WED", 3);
        // Block 3:
        week.put("THU", 4);
        week.put("FRI", 5);
        week.put("SAT", 6);
        // Block 4:
        if (S.equals("SUN")) {
            // Block 5:
            System.out.println(7);
        }
        // Block 6:
        else {
            // Block 7:
            System.out.println(7 - week.get(S));
        }
        // Block END.
    }
    }
}
