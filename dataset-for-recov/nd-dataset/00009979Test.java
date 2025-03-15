import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 8;
        // Block 2:
        String S = "))))((((";
        // Block 3:
        String nS = S;
        // Block 4:
        for (int i = 0; i < 50; i++) {
            // Block 5:
            nS = nS.replace("()", "");
        }
        // Block 6:
        int r = nS.length() - nS.replace(")", "").length();
        // Block 7:
        int l = nS.length() - nS.replace("(", "").length();
        // Block 8:
        System.out.println("(".repeat(r) + S + ")".repeat(l));
        // Block END.
    }
    }
}
