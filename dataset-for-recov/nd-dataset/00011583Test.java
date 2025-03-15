import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] youbi = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        // Block 2:
        String s = "SAT";
        // Block 3:
        for (int i = 0; i < youbi.length; i++) {
            // Block 4:
            if (s.equals("SUN")) {
                // Block 5:
                System.out.println(7);
                // Block 6:
                System.exit(0);
            }
            // Block 7:
            else if (youbi[i].equals(s)) {
                // Block 8:
                System.out.println(6 - i);
            }
        }
        // Block END.
    }
    }

