import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        String s = ")))())";
        // Block 3:
        int a = 0;
        // Block 4:
        int b = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (s.charAt(i) == '(') {
                // Block 7:
                a += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (a == 0) {
                    // Block 10:
                    b += 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    a -= 1;
                }
            }
        }
        // Block 13:
        System.out.println("(".repeat(b) + s + ")".repeat(a));
        // Block END.
    }
    }
}
