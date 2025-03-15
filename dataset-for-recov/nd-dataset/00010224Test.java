import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        String S = ")))())";
        // Block 3:
        int add_left = 0;
        // Block 4:
        int add_right = 0;
        // Block 5:
        for (char s : S.toCharArray()) {
            // Block 6:
            if (s == '(') {
                // Block 7:
                add_right += 1;
            }
            // Block 8:
            else if (add_right == 0) {
                // Block 9:
                add_left += 1;
            }
            // Block 10:
            else {
                // Block 11:
                add_right -= 1;
            }
        }
        // Block 12:
        System.out.println("(".repeat(add_left) + S + ")".repeat(add_right));
        // Block END.
    }
    }

