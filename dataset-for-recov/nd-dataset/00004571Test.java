import org.junit.jupiter.api.Test;

class _00004571Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String n = String.valueOf(s.length() - 2);
        // Block 3:
        String p = s.charAt(0) + n + s.charAt(s.length() - 1);
        // Block 4:
        System.out.println(p);
        // Block END.
    }
    }

