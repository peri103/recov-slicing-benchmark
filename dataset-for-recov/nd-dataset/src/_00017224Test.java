import org.junit.jupiter.api.Test;

class _00017224Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String[] parts = "D H".split(" ");
        String a = parts[0];
        String b = parts[1];
        System.out.println(new String[][] {{"H", "D"}, {b}}[a.equals("H") ? 0 : 1][0]);
        // Block END.
    }
    }

