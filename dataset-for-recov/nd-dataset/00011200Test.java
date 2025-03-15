import org.junit.jupiter.api.Test;

class _00011200Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] a = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // Block 2:
        String s = "SAT";
        // Block 3:
        for (int i = 0; i < 7; i++) {
            // Block 4:
            if (a[i].equals(s)) {
                // Block 5:
                System.out.println(7 - i);
            }
        }
        // Block END.
    }
    }

