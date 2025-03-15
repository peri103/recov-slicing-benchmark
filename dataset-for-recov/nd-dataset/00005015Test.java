import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "smiles";
        // Block 2:
        char[] nArray = n.toCharArray();
        // Block 3:
        char a = nArray[0];
        // Block 4:
        char b = nArray[nArray.length - 1];
        // Block 5:
        int c = nArray.length - 2; // since we pop two elements
        // Block 6:
        System.out.println(a + String.valueOf(c) + b);
        // Block END.
    }
    }
}
