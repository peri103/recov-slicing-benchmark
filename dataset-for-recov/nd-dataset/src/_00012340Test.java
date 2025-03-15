import org.junit.jupiter.api.Test;

class _00012340Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "atcoder";
        // Block 2:
        int N = S.length();
        // Block 3:
        if (S.equals(new StringBuilder(S).reverse().toString())) {
            // Block 4:
            if (S.substring(0, (N - 1) / 2).equals(S.substring((N + 1) / 2))) {
                // Block 5:
                System.out.println("Yes");
            }
            // Block 6:
            else {
                // Block 7:
                System.out.println("No");
            }
        }
        // Block 8:
        else {
            // Block 9:
            System.out.println("No");
        }
        // Block END.
    }
    }

