import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SAT";
        // Block 2:
        java.util.Map<String, Integer> days = new java.util.HashMap<>();
        days.put("SUN", 0);
        days.put("MON", 1);
        days.put("TUE", 2);
        days.put("WED", 3);
        days.put("THU", 4);
        days.put("FRI", 5);
        days.put("SAT", 6);
        // Block 3:
        if (S.equals("SUN")) {
            // Block 4:
            System.out.println(7);
        } 
        // Block 5:
        else {
            // Block 6:
            System.out.println((7 - days.get(S)) % 7);
        }
        // Block END.
    }
    }

