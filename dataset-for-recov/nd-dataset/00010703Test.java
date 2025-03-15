import org.junit.jupiter.api.Test;

class _00010703Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "akasaka";
        // Block 2:
        String answer = "Yes";
        // Block 3:
        if (!S.equals(new StringBuilder(S).reverse().toString())) {
            // Block 4:
            answer = "No";
        }
        // Block 5:
        String first = S.substring(0, S.length() / 2);
        // Block 6:
        String last = S.substring(S.length() / 2 + 1);
        // Block 7:
        if (!first.equals(new StringBuilder(first).reverse().toString())) {
            // Block 8:
            answer = "No";
        }
        // Block 9:
        if (!last.equals(new StringBuilder(last).reverse().toString())) {
            // Block 10:
            answer = "No";
        }
        // Block 11:
        System.out.println(answer);
        // Block END.
    }
    }

