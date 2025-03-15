import org.junit.jupiter.api.Test;

class _00011344Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "SAT";
        // Block 2:
        String[] youbi = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        int index = java.util.Arrays.asList(youbi).indexOf(s);
        // Block 4:
        int day = 7 - index;
        // Block 5:
        if (day == 0) {
            // Block 6:
            System.out.println(7);
        // Block 7:
        } else {
            // Block 8:
            System.out.println(day);
        }
        // Block END.
    }
    }

