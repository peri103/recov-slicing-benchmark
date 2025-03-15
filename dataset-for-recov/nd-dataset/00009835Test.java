import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String _ = "6";
        // Block 2:
        String S = ")))())";
        // Block 3:
        int needs_right = 0;
        // Block 4:
        int needs_left = 0;
        // Block 5:
        for (char c : S.toCharArray()) {
            // Block 6:
            if (c == '(') {
                // Block 7:
                needs_right += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (needs_right == 0) {
                    // Block 10:
                    needs_left += 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    needs_right -= 1;
                }
            }
        }
        // Block 13:
        System.out.println("(".repeat(needs_left) + S + ")".repeat(needs_right));
        // Block END.
    }
    }

