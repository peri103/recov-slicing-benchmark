import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3;
        // Block 2:
        String S = "())";
        // Block 3:
        int b = 0;
        // Block 4:
        int e = 0;
        // Block 5:
        for (char s : S.toCharArray()) {
            // Block 6:
            if (s == ')') {
                // Block 7:
                e += 1;
            }
            // Block 8:
            else {
                // Block 9:
                b += 1;
            }
            // Block 10:
            S = "(".repeat(Math.max(e - b, 0)) + S;
            // Block 11:
            b += Math.max(e - b, 0);
        }
        // Block 12:
        S += ")".repeat(Math.max(b - e, 0));
        // Block 13:
        System.out.println(S);
        // Block END.
    }
    }

