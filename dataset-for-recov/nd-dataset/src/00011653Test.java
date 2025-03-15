import org.junit.jupiter.api.Test;

class _00011653Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "SUN";
        // Block 2:
        String[] W = {"SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
        // Block 3:
        int p = 0;
        // Block 4:
        for (int i = 0; i < 7; i++) {
            // Block 5:
            p += 1;
            // Block 6:
            if (S.equals(W[i])) {
                // Block 7:
                break;
            }
        }
        // Block 8:
        System.out.println(p);
        // Block END.
    }
    }

