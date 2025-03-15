import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SAT";
        // Block 2:
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int idx = java.util.Arrays.asList(week).indexOf(s);
        // Block 4:
        System.out.println(7 - idx);
        // Block END.
    }
    }

