import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String s = "SAT";
        // Block 3:
        if (java.util.Arrays.asList(week).contains(s)) {
            // Block 4:
            int x = java.util.Arrays.asList(week).indexOf(s);
            // Block 5:
            System.out.println(7 - x);
        }
        // Block END.
    }
    }
}
