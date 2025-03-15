import org.junit.jupiter.api.Test;

class _00009880Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 8;
        // Block 2:
        String s = "))))((((";
        // Block 3:
        int L = 0;
        // Block 4:
        int R = 0;
        // Block 5:
        for (char i : s.toCharArray()) {
            // Block 6:
            if (i == ')') {
                // Block 7:
                if (R > 0) {
                    R -= 1;
                } else {
                    L += 1;
                }
            // Block 9:
            } else {
                // Block 10:
                R += 1;
            }
        }
        // Block 11:
        System.out.println("(".repeat(L) + s + ")".repeat(R));
        // Block END.
    }
    }

