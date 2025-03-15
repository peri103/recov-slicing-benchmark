import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "smiles";
        // Block 2:
        char I = S.charAt(0);
        // Block 3:
        char B = S.charAt(S.length() - 1);
        // Block 4:
        String figure = Integer.toString(S.length() - 2);
        // Block 5:
        System.out.println(I + figure + B);
        // Block END.
    }
    }

