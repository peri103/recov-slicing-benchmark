import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SAT";
        // Block 2:
        java.util.Map<String, Integer> ls = new java.util.HashMap<>();
        ls.put("MON", 0);
        ls.put("TUE", 1);
        ls.put("WED", 2);
        ls.put("THU", 3);
        ls.put("FRI", 4);
        ls.put("SAT", 5);
        ls.put("SUN", -1);
        // Block 3:
        System.out.println(6 - ls.get(s));
        // Block END.
    }
    }
}
