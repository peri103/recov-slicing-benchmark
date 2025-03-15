import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 8;
        // Block 2:
        String s = "))))((((";
        // Block 3:
        int opens = 0;
        // Block 4:
        int l = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (s.charAt(i) == '(') {
                // Block 7:
                opens += 1;
            }
            // Block 8:
            else {
                // Block 9:
                opens -= 1;
                // Block 10:
                if (opens < 0) {
                    // Block 11:
                    l += 1;
                    // Block 12:
                    opens = 0;
                }
            }
        }
        // Block 13:
        System.out.println("(".repeat(l) + s + ")".repeat(opens));
        // Block END.
    }
    }

