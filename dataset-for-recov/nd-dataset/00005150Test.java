import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        char start = s.charAt(0);
        // Block 3:
        char end = s.charAt(s.length() - 1);
        // Block 4:
        String length = String.valueOf(s.length() - 2);
        // Block 5:
        System.out.println(start + length + end);
        // Block END.
    }
    }
}
