import org.junit.jupiter.api.Test;

class _00011416Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SAT";
        // Block 2:
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 3:
        for (int i = 0; i < 7; i++) {
            // Block 4:
            if (week[i].equals(S)) {
                // Block 5:
                System.out.println(7 - i);
            }
        }
        // Block END.
    }
    }

