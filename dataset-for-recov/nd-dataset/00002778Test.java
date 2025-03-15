import org.junit.jupiter.api.Test;

class _00002778Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1111111111";
        // Block 2:
        int m = 1000;
        // Block 3:
        for (int i = 0; i < s.length(); i++) {
            // Block 4:
            int x = Integer.parseInt(s.substring(i, Math.min(i + 3, s.length())));
            // Block 5:
            if (m > Math.abs(753 - x)) {
                // Block 6:
                m = Math.abs(753 - x);
            }
        }
        // Block 7:
        System.out.println(m);
        // Block END.
    }
    }

