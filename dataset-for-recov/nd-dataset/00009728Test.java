import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        String s = ")))())";
        // Block 3:
        String ns = s;
        // Block 4:
        while (ns.contains("()")) {
            // Block 5:
            ns = ns.replace("()", "");
        }
        // Block 6:
        int l = ns.length() - ns.replace(")", "").length();
        // Block 7:
        int r = ns.length() - ns.replace("(", "").length();
        // Block 8:
        System.out.println("(".repeat(l) + s + ")".repeat(r));
        // Block END.
    }
    }

