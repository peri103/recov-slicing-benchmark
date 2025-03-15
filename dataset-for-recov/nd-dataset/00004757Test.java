import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int n = s.length();
        // Block 3:
        int a = n - 2;
        // Block 4:
        System.out.println(s.charAt(0) + Integer.toString(n - 2) + s.charAt(n - 1));
        // Block END.
    }
    }
}
