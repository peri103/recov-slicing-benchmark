import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] days = {"DAYS", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
        // Block 2:
        String s = "SUN";
        // Block 3:
        for (String i : days) {
            // Block 4:
            if (i.equals(s)) {
                // Block 5:
                System.out.println(java.util.Arrays.asList(days).indexOf(i));
                // Block 6:
                break;
            }
        }
        // Block END.
    }
    }
}
