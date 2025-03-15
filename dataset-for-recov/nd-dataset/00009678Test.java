import org.junit.jupiter.api.Test;

class _00009678Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        String motoS = ")))())";
        // Block 3:
        char[] S = motoS.toCharArray();
        // Block 4:
        int start = 0;
        // Block 5:
        int end = 0;
        // Block 6:
        for (int i = 0; i < N; i++) {
            // Block 7:
            if (S[i] == '(') {
                // Block 8:
                end += 1;
            }
            // Block 9:
            else {
                // Block 10:
                end -= 1;
            }
            // Block 11:
            if (end < 0) {
                // Block 12:
                start += 1;
                // Block 13:
                end = 0;
            }
        }
        // Block 14:
        System.out.println("(".repeat(start) + motoS + ")".repeat(end));
        // Block END.
    }
    }

