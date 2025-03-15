import org.junit.jupiter.api.Test;

class _00011469Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        String[] D = {"", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
        // Block 3:
        for (int i = 1; i < 8; i++) {
            // Block 4:
            if (S.equals(D[i])) {
                // Block 5:
                System.out.println(i);
            }
        }
        // Block END.
    }
    }

